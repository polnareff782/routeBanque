<%-- 
    Document   : Historique
    Created on : Mar 8, 2021, 3:18:50 PM
    Author     : marye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>             
        <%@ include file="EnteteClient.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
              <div>
            <div class="row">
  <c:forEach items="${historiques}" var="h">
                <div class="col-md-12">
                  
                        <div class="col-sm-4 mt-4">
                            <div class="card card-perso">
                                <div class="card-body">
                                    <!-- <strong class="text-info">Utilisateur : ${h.person.nom}</strong><br> -->
                                    <strong class="text-danger">Type d'operation : ${h.typeOperation}</strong><br>
                                    <strong class="text-black">Fais le : ${h.dateOperation}</strong><br>
                                    <strong class="text-success">Montant : ${h.montantOperation}</strong><br>
                                </div>
                            </div>
                        </div>

                    </c:forEach>      
                </div>
            </div>
        </div>
        </div>
</body>
</html>
