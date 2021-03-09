<%-- 
    Document   : Activer_DesactiverConseiller
    Created on : 8 mars 2021, 10:52:22
    Author     : Nathan Ghozlan
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">CDA 2020</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse " id="navbarNav">
                <ul class="navbar-nav nav-fill w-100">
                    <li class="nav-item active">
                        <a class="nav-link" href="AccueilServlet">Accueil</a>
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

        <h1>Bonjour ${user.login} !</h1>
        <h5>Listes des conseillers:</h5>
        <table class="table table-hover">
            <thead>
                <tr class="table-active">
                    <th>ID</th>
                    <th>LOGIN</th>
                    <th>PASSWORD</th>
                    <th>Nom</th>                    
                    <th>Prenom</th>
                    <th>Sexe</th>
                    <th>Etat</th>                   
                    <th>Activation Conseillers</th>
                    <th>Désactivation Conseillers</th>

                </tr>
            </thead>
            <tbody>

                <c:forEach items="${users}" var="u">

                    <tr style="border: 1px solid black;">
                        <td>${u.id}</td>
                        <td>${u.login}</td>
                        <td>${u.mdp}</td>
                        <td>${u.person.nom}</td>
                        <td>${u.person.prenom}</td>
                        <td>${u.person.sexe}</td>
                        <td>${u.statut}</td>
                <form action="ActiverConseiller" method="POST">
                    <input type="hidden" value="${u.id}" name="iduser">
                    <td><button  type="submit" class="btn btn-outline-success" onclick="" >Activer compte</button> </td>
                    <td><button  type="submit" class="btn btn-outline-danger" >Désactiver compte</button> </td>

                </form>
            </tr>

        </c:forEach>

    </tbody>
</table>

</body>
</html>
