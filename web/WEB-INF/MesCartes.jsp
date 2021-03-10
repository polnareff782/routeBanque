<%-- 
    Document   : MesCartes
    Created on : Mar 5, 2021, 12:54:47 AM
    Author     : marye
--%>

<%@page import="fr.esic.model.Person"%>
<%@page import="fr.esic.model.User"%>
<%@page import="fr.esic.model.Compte"%>
<%@page import="fr.esic.dao.CompteDao"%>
<%@page import="fr.esic.servlet.MesCartes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>     
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="EnteteClient.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/c441cb6851.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/Style_1.css">    

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta  <title>MesCartes</title>2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>

        <title>MesCartes</title>
    </head>
    <body> 
        <form action="AjoutOperation?numcarte=${comptes.numcarte} " method="Post">
            <div class="row">
                <div class="col-md-8"></div>

                <div class="col-md-2 mb-3">
                    <br><br>
                    <c:if test="${comptes.etatcarte == true}">
                        <c:if test="${comptes.opposition == false}">
                            <button type="button" class="btn btn-outline-info" data-bs-toggle="modal" data-bs-target="#staticBackdrop"  id="operation">Operations</button>

                        </c:if>
                        <c:if test="${comptes.opposition == true}">
                            <button type="button" class="btn btn-info" data-bs-toggle="modal" data-bs-target="#staticBackdrop" id="operation" disabled>
                                Operations
                            </button>
                        </c:if>
                    </c:if>

                    <c:if test="${comptes.etatcarte == false}">
                        <button type="button" class="btn btn-outline-info"" data-bs-toggle="modal" data-bs-target="#staticBackdrop" id="operation" disabled>
                            Operations
                        </button>
                    </c:if>

                    <!-- Modal -->
                    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">

                                    <h4 class="modal-title text-primary ">Choissisez une opération</h4>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="col-md-8 px-5">
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="operation" id="depot" value="depot">
                                        <label class="form-check-label" for="inlineRadio1">Depot</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="operation" id="retrait" value="retrait">
                                        <label class="form-check-label" for="inlineRadio2">Retrait</label>
                                    </div>
                                </div>
                                <div class="row g-3 align-items-center mt-4">
                                    <div class="col-auto">
                                        <select hidden id="idperson" name="idperson">
                                        <option value="${comptes.person.id}">${comptes.person.id}</option>
                                        </select>
    
                                        <label for="inputmontant" class="col-form-label">Montant :</label>
                                    </div>
                                    <div class="col-auto">
                                        <input type="number" name="montant"  min="1" class="form-control" placeholder="Saisir le montant" >
                                    </div>
                                </div>
                                <br>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Annuler</button>
                                    <button type="submit" class="btn btn-outline-success">Valider</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 

            </div>
        </form>


        <form action="OppositionServlet?numcarte=${comptes.numcarte}" method="Post">
            <div class="row">
                <div class="col-md-9"></div>
                <div class="col-md-3">
                    <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Opposition</button>
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel text-danger">Faire une opposition</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    L'opposition se fait en cas de vole ou perte de votre carte. <br>UNE FOIS VOTRE CARTE EST <span class="text-danger bold">DESACTIVEE</span>, VOUS DEVEZ CONTACTER VOTRE CONSEILLER POUR L'ACTIVER.
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Annuler</button>
                                    <button type="submit" class="btn btn-success" name="opposition" id="opposition" >Valider l'opposition</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </form>


        <form action="DemandeDecouvertServlet?numcarte=${comptes.numcarte}" method="Post">
            <div class="row">
                <div class="col-md-9">
                    
                </div>
                <div class="col-md-3 mt-2">

                    <c:if test="${comptes.etatcarte == true}">
                        <c:if test="${comptes.opposition == false}">
                            <button type="button" class="btn btn-outline-warning" data-bs-toggle="modal" data-bs-target="#decouvertmodel" >Demande Decouvert</button>
                        </c:if>
                        <c:if test="${comptes.opposition == true}">
                            <button type="button" class="btn btn-outline-warning" disabled >Demande Decouvert</button>

                        </c:if>

                    </c:if>

                    <div class="modal fade" id="decouvertmodel" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel text-danger">Demande de Decouvert</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">

                                   
                                    <div class="mb-3">
                                        <label for="montant de decouvert" class="form-label">Montant de découvert</label>
                                        <input type="number" class="form-control"  name="montant">
                                    </div>

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Annuler</button>
                                    <button type="submit" class="btn btn-success" name="decouvert" id="decouvert" >Valider </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </form> 

        <form action="MesCartes?numcarte=${comptes.numcarte}" method="Post">
            <div class="card" style="width: 30rem ;" >
                <img src="img/carte.jpg" width ="190px" height="200px" class="card-img-top" alt="Votre Carte bancaire">
                <div class="card-body">
                    <h5 class="card-title">Carte Bancaire</h5>
                    <p name="numcarte" class="card-text">${comptes.numcarte}</p>
                    
                    <h5 class="card-title">Solde</h5>
                    <p class="card-text"style="color:grey"> ${comptes.solde}.00€</p>
                    
                     <h6 class="card-title">Montant de découvert</h6>
                    <p class="card-text"style="color:red"> ${comptes.montantDecouvert}.00€</p>
                    
                    <h6 class="card-title">Solde Total</h6>
                    <p class="card-text"style="color:blue">${comptes.solde + comptes.montantDecouvert}.00€</p>


                </div>



                <div class="col-md-12 px-2 text-center">
                    <span class="p-redirection" id="redirection">
                        <c:if test="${comptes.opposition == false}">
                            <c:if test="${comptes.etatcarte == false}">
                                <button type='submit' class='btn btn-success btn-block' id='btnAnnuler' >Activer</button>
                            </c:if>
                            <c:if test="${comptes.etatcarte == true}">
                                <button type='submit' class='btn btn-danger btn-block' id='btnAnnuler' ">Desactiver</button>
                            </c:if>
                        </c:if>
                        <c:if test="${comptes.opposition == true}">
                            <p>Votre carte est suspendu!<br><span class="text-danger bold">VOUS DEVEZ CONTACTER VOTRE CONSEILLER POUR L'ACTIVER.</span> </p>
                        </c:if></span>
                </div>
            </div>  
        </form>

        <script type="text/javascript" src="app.js"></script>                    
    </body>
</html>
