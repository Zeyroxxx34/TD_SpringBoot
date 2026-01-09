```
TD Spring Boot


-- Description --

API de gestion de jeux vidéos utilisant :

Backend : Spring Boot

Base de données : MySQL

-- Architecture du projet --


GestionJeuxVideos/
├─ src/main/java/com/GestionJeuxVideos/                 # Backend Spring Boot
│  ├─ config/                                           # Sécurité de l'api
│  │  └─ SecurityConfig.java
│  ├─ controller/                                       # Requêtes HTTP de l'api
│  │  ├─ AuthController.java
│  │  ├─ CategoryController.java
│  │  ├─ ReviewController.java
│  │  └─ VideoGameController.java
│  ├─ model/                                            # Définition des entités (correspond aux tables en BDD)
│  │  ├─ Category.java
│  │  ├─ Review.java
│  │  └─ VideoGame.java
│  ├─ repository/                                       # Requêtes SQL automatiques via JPA
│  │  ├─ CategoryRepository.java
│  │  ├─ ReviewRepository.java
│  │  └─ VideoGameRepository.java
│  ├─ security/                                         # Authentification et autorisations
│  │  ├─ JwtUtil.java
│  │  └─ JwtRequestFilter.java
│  ├─ service/                                          # Logique métier entre le controller et le service
│  │  ├─ CategoryService.java
│  │  ├─ ReviewService.java
│  │  └─ VideoGameService.java
│  └─ GestionJeuxVideosApplication.java
├─ .gitignore
├─ pom.xml                                              # Dépendances du projet
└─ README.md                                            # Documentation du projet


Le projet est exécutable directement depuis l'IDE.

URL du swagger de l'API : http://localhost:8080/swagger-ui/index.html
Dans celui-ci sont détaillés les endpoints et les schémas.

```

