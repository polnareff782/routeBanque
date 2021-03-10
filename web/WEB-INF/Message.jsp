<%-- 
    Document   : Message
    Created on : Mar 8, 2021, 8:51:34 PM
    Author     : marye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="EnteteClient.jsp"%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <link rel="stylesheet"type="text/css" href="style_1.css" >


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>


    <body><br><br><br>

        <form action="MessageServlet?id=${comptes.person.id}" method="post">
            <div class="container">
                <div class="row"> 
                    <div id="accordion" class="col-md-4 mb-2">
                        <div class="card">
                            <div class="card-header">
                                <a class="card-link text-danger " data-toggle="collapse" href="#collapseOne" >
                                    Nouveau message 
                                </a>
                            </div>
                            <div id="collapseOne" class="collapse show" data-parent="#accordion">
                                <div class="card-body">

                                    <div class="mb-3">
                                        <input class="form-control" type="text" placeholder="A :" aria-label="Disabled input example" >
                                    </div>
                                    <div class="mb-3">
                                        <input class="form-control" type="text" aria-label="objet" placeholder="Objet">
                                        <textarea class="form-control" name="contenu" id="exampleFormControlTextarea1" rows="3" placeholder="Rédiger votre message"></textarea>
                                    </div>

                                    <button type="submit" class="btn btn-success ">Envoyer</button>




                                </div>
                            </div>
                        </div>  
                    </div>
                </div>  
            </div>

        </form>

        <div class="container">
            <div class="row"> 
                <div id="accordion" class="col-md-4 mb-2">
                    <div class="card ">
                        <div class="card-header">
                            <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
                                Messages reçues
                            </a>
                        </div>
                        <div id="collapseTwo" class="collapse" data-parent="#accordion">
                                 <c:forEach items="${message}" var="m">
                                
                            <div class="card-body">
                                 ${m.contenuMessage}    ${m.dateMessage}
                            </div>
                                </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="container">
            <div class="row"> 
                <div id="accordion" class="col-md-4 mb-2">
                    <div class="card">
                        <div class="card-header">
                            <input  hidden type="test" name="idperson" value="${comptes.person.id}">
                            <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
                                Messages envoyés
                            </a>
                        </div>
                        <div id="collapseThree" class="collapse" data-parent="#accordion">
                            <c:forEach items="${messages}" var="m">
                                
                            <div class="card-body">
                                 ${m.contenuMessage} ${m.dateMessage}
                            </div>
                                </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
</body>
</html>
