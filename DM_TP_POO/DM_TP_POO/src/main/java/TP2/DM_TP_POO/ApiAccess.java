package TP2.DM_TP_POO;

import TP2.DM_TP_POO.geoApi.geoJson;
import TP2.DM_TP_POO.meteoApi.meteoJson;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ApiAccess {

    private final static String apiKey = "876bc9ca6a0ed5bc46a0ad5173ddc241";

    @Bean
    public static geoJson ApiGeoAddress(String address) {
        return new RestTemplate().getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address, geoJson.class);
    }

    @Bean
    public static meteoJson ApiMeteoAddress(double lat, double lon){
        return new RestTemplate().getForObject(
                "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey + "&units=metric", meteoJson.class);
    }

}
