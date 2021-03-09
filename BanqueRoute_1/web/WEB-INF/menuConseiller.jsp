<%-- 
    Document   : menuConseiller
    Created on : 3 mars 2021, 22:30:43
    Author     : Nathan Ghozlan
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>JSP Page</title>
    </head>
    <body>
        <div>

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="AccueilServlet">CDA 2020</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav nav-fill w-100">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Valider compte client</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Activer/Désactiver compte client 	</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Activer/Désactiver carte client </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Historique des comptes clients  </a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Autoriser un découvert</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Contacter client</a>
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
</html>