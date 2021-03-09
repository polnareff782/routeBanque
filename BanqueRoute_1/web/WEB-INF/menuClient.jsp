
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="EnteteClient.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/c441cb6851.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>

    </head>

    <body>
        <div class="container center mt-2">
            <h6 class="titre text-danger">
                <span class="name"> </span> </h6>

            



        <div class="container center">
            <div class="container-fluid">
                <nav class="navbar navbar-expand-md  navbar-white bg-light">

                    <div class="collapse navbar-collapse " id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3 px-3" aria-current="page" href="#">Mes comptes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="MesCartes">Mes cartes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="Virements">Virements</a>
                            </li>  
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="Prelevements">Prélèvements</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active font-weight-bold px-3" href="MonBudget">Mon budget</a>
                            </li>


                            <ul class="navbar-nav">

                                <li class="nav-item">
                                    <a class="nav-link active font-weight-bold px-3" href="NosOffres"> Nos offres</a>
                                </li>
                            </ul>
                    </div>
                </nav> 
            </div>
        </div>


        <br>



        <div class="container center">
            <div class="title-zone px-0 "><h3>Mes comptes</h3>
                <br><br></div>
            
            <div class="row">


                <div class="col-md-5 mb-2">
                    <form>
                        <div class="form-row">

                            <div class="form-group col-md-8 mb-2">

                                <div class="title-zone px-0 text-primary"><h4>COMPTES BANCAIRES</h4></div>
                                <label>Compte Bancaire</label>
                                <input type="text" class="form-control" name=" numCompte" placeholder=" Compte Bancaire">${User.solde}

                                <div class="form-group col-md-8 px-3"> 
                                    <label>Carte Bancaire</label>
                                    <input type="text" class="form-control" id="numCarte" placeholder="Carte Bancaire">${User.numCarte}
                                </div>
                            </div>  
                        </div>

                    </form>
                    <br><br><br>
                    <div class="title-deux text-warning "><h3>COMPTES D'EPARGNE </h3>

                    </div>
                    <form>
                        <div class="form-row">
                            <div class="form-group col-md-8 mb-2">
                                <label>Livret A</label>
                                <input type="text" class="form-control" name="LivretA" placeholder="Livret A" >${User.soldeepargne}
                            </div> 

                        </div>
                    </form>
                    <br>
                </div>




                <br>     <br> 

                <div class="col-md-4 mb-2 px-5">

                    <br>  <br>   <br> 
                    <!-- <div class="progress mt-4">
                        <div class="progress-bar bg-success progress-bar-striped progress-bar-animated" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"> 25%</div>
                    </div>

                    <br>
                    <br>
                    <br><br>                    <br>

                    <br>   <br><br>

                    <div class="progress">
                        <div class="progress-bar bg-info progress-bar-striped progress-bar-animated " role="progressbar" style="width: 35%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"> 35%</div>
                    </div>  -->
                    <label>  </label>
                  <!--<button type="button" class="btn btn-outline-danger">Désactiver carte</button>--> 
                  
                  ${user.login}
                   ${comptes.solde}

                </div>
                <div class="col-sm-3 mb-2 px-5">
                    <br>     <br>  <br>  
                
              
            </div>
        </div>

  

    </body>
</html>
