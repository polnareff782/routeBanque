<%-- 
    Document   : home
    Created on : 12 févr. 2021, 16:00:52
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <title>Accueil</title>
    </head>
    <body>

        <%@include file="menuAdmin.jsp" %>

        <div class="container mt-4">
            <h1 class="titre">Hello <span class="name">${user.prenom} ${user.nom}</span> </h1>
            <br><br>



            <div>
                <div class="row">
                    <c:forEach items="${memos}" var="m">
                        <div class="col-sm-3">
                            <div class ="card card-perso-box">
                                <div class="card-body">
                                    <strong class="text-info"> ${m.dateCreation} ${m.user.nom}</strong>
                                    <p> ${m.contenue}</p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </body>
</html>
