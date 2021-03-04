<%-- 
    Document   : menuClient
    Created on : 3 mars 2021, 21:02:06
    Author     : Nathan Ghozlan
--%>
<!-- 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        CSS only 
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div>

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">CDA 2020</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav nav-fill w-100">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Modifier mon profil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Activer/Désactiver carte</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Consulter solde et opérations </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Faire une demande de decouvert </a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Contacter conseiller</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Deco"><span class="material-icons red600">
                                    logout
                                </span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
    </body>
</html>-->
<%-- 
    Document   : MenuClient
    Created on : 1 mars 2021, 19:17:51
    Author     : marye
--%>

<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/c441cb6851.js" crossorigin="anonymous"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container center mt-2">
            <h6 class="titre text-danger">
                <span class="name">${client.prenom} ${client.nom}  </span> </h6>
            <div class="container-fluid">
                <nav class="navbar navbar-expand-md  navbar-white bg-white">
                    <!-- logo<a href="#"> <i class="fas fa-hand-holding-usd fa-2x"></i></a>-->


                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse  justify-content-between" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3 px-3" aria-current="page" href="#">Comptes et cartes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#">Emprunter</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#">Epargner</a>
                            </li>  
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#">Nos conseils</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#">Autres</a>
                            </li>
                        </ul>

                        <ul class="navbar-nav">

                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#"> Notifications</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href='/SentEmail'>Messagerie</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#">Déconnexion</a>
                            </li>
                        </ul>

                    </div>
            </div>
        </div>
    </nav>


    <div class="container center">

        <div class="container-fluid">
            <nav class="navbar navbar-expand-md  navbar-white bg-light">
                <!-- logo<a href="#"> <i class="fas fa-hand-holding-usd fa-2x"></i></a>-->


                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active font-weight-bold px-3 px-3" aria-current="page" href="#">Mes comptes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active font-weight-bold px-3" href="#">Mes cartes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active font-weight-bold px-3" href="#">Virements</a>
                        </li>  
                        <li class="nav-item">
                            <a class="nav-link active font-weight-bold px-3" href="#">Prélèvements</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active font-weight-bold px-3" href="#">Mon budget</a>
                        </li>


                        <ul class="navbar-nav">

                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="#"> Nos offres</a>
                            </li>

                        </ul>

                </div>
        </div>
    </div>
</nav
<br><br>
<br>

<div class="container center">
            <div class="title-zone"><h6>Mes comptes</h6>

                
                
            </div>
</div>

</body>
</html>
