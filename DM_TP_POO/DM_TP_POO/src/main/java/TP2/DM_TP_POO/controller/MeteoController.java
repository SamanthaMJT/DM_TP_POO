package TP2.DM_TP_POO.controller;

import TP2.DM_TP_POO.ApiAccess;
import TP2.DM_TP_POO.geoApi.geoJson;
import TP2.DM_TP_POO.meteoApi.meteoJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MeteoController {

    @GetMapping("/meteo")
    public String meteo(Model model) {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String result(@RequestParam(name="address") String address, Model model) {
        geoJson georesponse = ApiAccess.ApiGeoAddress(address);
        model.addAttribute("addressAPI", georesponse.getFeatures().get(0).getProperties().getLabel());
        double[] coordonnates = georesponse.getFeatures().get(0).getGeometry().getCoordinates();
        meteoJson meteoResponse = ApiAccess.ApiMeteoAddress(coordonnates[1], coordonnates[0]);
        model.addAttribute("meteo", meteoResponse.getMain().getTemp());
        return "meteo";
    }

}
