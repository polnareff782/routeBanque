<%-- 
    Document   : voirClient
    Created on : 7 mars 2021, 17:25:59
    Author     : dylan55
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
            <h1>Bonjour ${Person.nom} !</h1>

            <h5>Listes des clients</h5>
            <form action="activerClient" method="POST">
            <table class="table table-hover">
                <thead>
                    <tr class="table-active">
                        <th>ID</th>
                        <th>LOGIN</th>
                        <th>PASSWORD</th>
                        <th>Nom</th>                    
                        <th>prenom</th>                    
                        <th>statut</th>                    
                        <th>activer/desactiver client</th>
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
                            <td>${u.statut}</td>
                    
                            
                        <td>
                            <button  type="submit" class="btn btn-outline-success" >activer/desactiver client</button> 
                        </td>
                        <td> <input type="hidden" value="${u.id}" name="iduser"> </td>
                    </tr>

                </c:forEach>

                </tbody>
            </table>
               </form>

        </div>

    </body>
</html>
