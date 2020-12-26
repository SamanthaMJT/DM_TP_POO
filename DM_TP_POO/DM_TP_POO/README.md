# GitHub

lien : 

# Partie 1 :

étape 5 :
    <br>Web : Permet d'utiliser le mapping et les méthodes GET et POST plus facilement et lancer le code dans un navigateur.
    <br>JPA : Permet de stocker et d'utiliser des données dans une base de données relationelle.
    <br>Hibernate : Permet d'initialiser la base de données de JPA.
    <br>H2 : Représente une base de données in-memory de l'application.
    <br>DevTools : Possède un serveur qui permet de rafraîchir un navigateur (Chrome, Firefox, Safari) quand les ressources de l'application changent.
    <br>Thymeleaf : Permet de créer des template réutilisables en HTML.

étape 13 :
    <br>Q1 : L'url d'appel `/greeting` est paramétré par `@GetMapping("/greeting")`.
    <br>Q2 : Le choix du fichier HTML à afficher se fait par le `return "greeting"` de la fonction associée au `@GetMapping`.
    <br>Q3 : Après avoir changé `name` en `nameGET` dans l'url, le nom est envoyé par la méthode `GET` au sein de l'url.
    
étape 17 :
    La table `Address` avec ses différentes colonnes (`id`, `creation`, `content`) est apparue dans la base de données ainsi que l'onglet `sequences`.

étape 18 :
    La base de données a été initialisée par Hibernate avec les différentes classes de l'application qui possèdent `@Entity`, `@Id` et `@GeneratedValue`.
    C'est pour cela que la table Address qui correspond à la classe Address et ses différentes colonnes qui correspondent aux différents attributs ont été ajouté.
    
étape 20 :
    Aprés avoir remplacé `addresse` par `Address`, on observe tout le contenue ajouté grâce à `data.sql` de la table `Address`.
    
étape 23 :
    `@Autowired` permet d'autoriser les relations entre les différentes dépendences de Spring.

# Partie 2 :

étape 3 :
    On ne garde que les attributs nécessaire à la vérification et à l'utilisation de l'API météo.

étape 6 :
    <br>Q1 : Il faut une clé API pour faire appel à l'url.
    <br>Q2 : `https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}`
    <br>Q3 : On appel la méthode `HTTP GET` lors de l'appel de l'API.
    <br>Q4 : On passe les paramètres de l'url par concaténation de la chaîne de caractère de l'url.
    <br>Q5 : La température du lieu visé se trouve dans la classe `Main`. Elle correspond à l'attribut `temp`.
        Pour avoir le temps qu'il fait à une certaine location, on utilise l'extension Current Weather Data d'OpenWeather. Pour connaître le temps qu'il fera, il faut utiliser Hourly Forecast 4 days d'OpenWeather. La prévision se trouvera alors dans `list`.
