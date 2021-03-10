

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
            <form action="#" method="POST">
            <table class="table">
                <thead>
                    <tr class="table-active">
                        <th>ID</th>
                       
                        <th>Nom</th>                    
                        <th>Prenom</th> 
                        <th>Num Compte</th>                                            
                        <th>Num Carte</th>                    
                        <th>Type Carte</th>                    
                        <th>Activer/Descativer Carte</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach items="${users}" var="u">

                        <tr style="border: 1px solid black;">
                            
                            <td>${u.person.id}</td>
                            <td>${u.person.nom}</td>
                            <td>${u.person.prenom}</td>
                            <td>${c.numCp}</td>
                            <td>${compte.numCarte}</td>
                        <td><input type="hidden" value="${u.id}" name="iduser"></td>
                        <td>
                            <button  type="submit" class="btn btn-outline-success" >Modifier Infos Profil</button> 
                        </td>
                    </tr>

                </c:forEach>

                </tbody>
            </table>
                                    </form>

        </div>

    </body>
</html>
