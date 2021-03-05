<%--
    Document   : homeConseiller
    Created on : 3 mars 2021, 21:04:16
    Author     : Nathan Ghozlan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="menuConseiller.jsp" %>
        <h1>Hello World!</h1>
         <div class="container">
            <h1 class="titile">Bonjour ${user.nom} !</h1>
            <br>
            <center>
                 <h4>Liste Client Active</h4>
            <table class="table-success" style="border: 1px solid black; width: 700px">
                <thead>
                    <tr class="table-active" style="border: 1px solid black;" >
                        <th style="border: 1px solid black;" >ID</th>
                        <th>NOM</th>
                        <th>PRENOM</th>
                        <th>LOGIN</th>
                        <th>PASSWORD</th>
                        <th>ACTIONS</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${users}" var="m">
                        <tr style="border: 1px solid black;"     >
                            <td>${m.id}</td>
                            <td>${m.nom}</td>
                             <td>${m.prenom}</td>
                             <td>${m.login}</td>
                             <td>${m.mdp}</td>
                             <td> <button type="button" style="display:  inline-block"  onclick="location.href ='Update?id=${m.id}'" class="btn btn-success" >UPDATE</button> <button  type="submit" onclick="location.href ='DesactiverUser?login=${m.login}'" class="btn btn-success" >Désactiver</button> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
                <br>
                 <h4>Liste Client Désactiver</h4>
            <table class="table-success" style="border: 1px solid black; width: 700px">
                <thead>
                    <tr class="table-active" style="border: 1px solid black;" >
                        <th style="border: 1px solid black;" >ID</th>
                        <th>NOM</th>
                        <th>PRENOM</th>
                        <th>LOGIN</th>
                        <th>PASSWORD</th>
                        <th>ACTIONS</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${users2}" var="m">
                        <tr style="border: 1px solid black;"     >
                            <td>${m.id}</td>
                            <td>${m.nom}</td>
                             <td>${m.prenom}</td>
                             <td>${m.login}</td>
                             <td>${m.mdp}</td>
                             <td> <button type="button" style="display:  inline-block"  onclick="location.href ='Update?id=${m.id}'" class="btn btn-success" >UPDATE</button> <button  type="submit" onclick="location.href ='ActiveUser?login=${m.login}'" class="btn btn-success" >Activer</button> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</center>
        </div>
    </body>
</html>
