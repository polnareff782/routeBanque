<%-- 
    Document   : menu
    Created on : 26 févr. 2021, 10:40:18
    Author     : polnareff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <!-- CSS only -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <script src="https://kit.fontawesome.com/8dd18f421b.js" crossorigin="anonymous"></script>
        <title class="titre">Accueil Conseiller</title>
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                
                <a class="navbar-brand"><img src="../maze_bank.jpg" alt=""/>Banqueroute Conseiller </a>

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav nav-fill w-100">


                        <li class="nav-item">
                            <a class="nav-link" href="#">Autoriser un Découvert</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contacter le Client</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Deco">
                                <span class="material-icons red600">
                                    logout
                                </span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <div style="background-color: #375a7f;" class="titre-h3 titre">
            <b style="color: azure;">Action sur Clients</b>
        </div><br>
        <div class="container">
            <div class="row row-cols-2 row-cols-lg-5 g-2 g-lg-3">
                <div class="col">
                    <div class="p-3 border bg-light">Activer/Désactiver compte client</div>
                </div>
                <div class="col">
                    <div class="p-3 border bg-light">Activer/Désactiver carte client</div>
                </div>
                <div class="col">
                    <div class="p-3 border bg-light">Historique opérations client</div>
                </div>
                <div class="col">
                    <div class="p-3 border bg-light"><a  href="InscriptionConseillerServlet"> Créer  un compte client</a></div>
                </div>
                <div class="col">
                    <div class="p-3 border bg-light">Validation création de compte</div>
                </div>
                <img src="../maze_bank.jpg" alt=""/>ou es tu zeubi
            </div>
        </div>
    </body>
</html>
