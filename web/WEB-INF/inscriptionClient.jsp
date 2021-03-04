<!-- <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
     <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>AC MILAN</title>
        <link rel="stylesheet" href="css/style.css">
     
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
   
    <body>
       <div class="container mt-4">
            <form action="inscription" method="POST">
                <div class="content-login">
                    <div class="card shadow-card">
                        <div class="card-header card-header-back">
                            <h5 class="card-title-perso text-center"> Inscription Client</h5>
                        </div>
                        <div>
                            <div class="card-body">
                                <div class="mb-3">
                                    <label for="nom" class="my-label">Nom</label>
                                    <input type="text" id="nom" class="form-control" name="nom">
                                </div>
                                <div class="mb-3">
                                    <label for="prenom" class="my-label">Prenom</label>
                                    <input type="text" id="prenom" class="form-control" name="prenom">
                                </div>
                                <div class="mb-3">
                                    <label for="login" class="my-label">Login</label>
                                    <input type="text" id="login" class="form-control" name="login">
                                </div>
                                <div class="mb-3">
                                    <label for="mdp" class="my-label">Password</label>
                                    <input type="password" id="mdp" class="form-control" name="mdp">
                                </div>
                                <div class="mb-3">
                                    <label for="telephone" class="my-label">Téléphone</label>
                                    <input type="text" id="login" class="form-control" name="telephone">
                                </div>
                                
                                <div class="d-grid gap-2">
                                    <button type="submit" class="btn btn-primary btn-block" onclick="location.href='inscription'">Inscription</button>
                                    <button type="button" class="btn btn-success btn-block" onclick="location.href='login'">Se connecter</button>

                                </div>

                                <p class="text-center text-danger" id="msg"> ${msg} </p>
                            </div>
                        </div>

                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire d'inscription Banque</title>
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <script type="text/javascript" src="app.js"></script>

    </head>
    <body>
    <c:if test="${ !empty fichier }"><p>
        <c:out value="Le fichier ${ fichier } (${ description }) a été uploadé !" /></p></c:if>       
<form action="InscriptionClient" method="post" enctype="multipart/form-data">

    <div class="main_div">

        <div class="container mt-2">

            <h2 class="title text-center mt-2">Inscription </h2>
            <fieldset class="form-group">
                <div class="row">
                    <legend class="col-form-label col-sm-2 pt-0"> Civilité : </legend> 
                    <div class="col-sm-1">

                        <div class=" form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="sexe" id="sexe" value="m">
                            <label class="form-check-label" for="inlineRadio1">Monsieur</label>
                        </div>

                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="sexe" id="sexe" value="f">
                            <label class="form-check-label" for="inlineRadio1">Madame</label>
                        </div>

                    </div>
                </div>

            </fieldset>
            <div class="form-group row mb-2 mt-4">
                <label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="nom"  placeholder="Veuillez Saisir Votre NOM" required>
                </div>


                <label for="description" class="col-sm-2 col-form-label">Description de fichier</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="description" id="description" placeholder="Passport...">
                </div>
            </div>

            <div class="form-group row mb-2 ">
                <label for="inputPrenom" class="col-sm-2 col-form-label">Prénom</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="prenom" id="prenom" placeholder="Veuillez Saisir Votre Prenom" required>
                </div>


                <label for="fichier" class="col-sm-2 col-form-label">Justificatif à envoyer</label>
                <div class="col-sm-3 ">
                    <input type="file" class="form-control" name="fichier" id="fichier"  >
                </div>
            </div>

            <div class="form-group row mb-2 ">

                <label for="inputDate" class="col-sm-2 col-form-label">Date de naissance</label>
                <div class="col-sm-3 mb-2">   
                    <input type="date" class="form-control" name="datenaissance" id="datenaissance"required>
                </div>
                <!--<div class="col-sm-6 mb-2">   
                    <button type="submit" class="btn btn-danger"  onclick="Reset()">Annuler</button>
                    </div> -->
                  

                <div class="form-group row mb-2 "> 

                    <label for="inputtel" class="col-sm-2 col-form-label">Numèro de tèléphone</label>
                    <div class="col-sm-3">    
                        <input type="number" class="form-control" name="numtel"  id="numtel"required>
                    </div>
                    
                    

                </div>
                <div class="form-group row mb-2 "> 

                    <label for="inputAddress" class="col-sm-2 col-form-label">Addresse</label>
                    <div class="col-sm-3">   
                        <input type="text" class="form-control" name="addresse" placeholder="1234 Main St, Apartment" id="adresse">
                    </div>
                </div>

                <div class="form-group row mb-2 ">

                    <label for="inputEmail4" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-3">   
                        <input type="email" class="form-control" name="Email" placeholder="xxxx@xxxx.xxx" id="email">
                    </div> 
                </div>
                <div class="form-group row mb-2 "> 

                    <label for="inputmogin" class="col-sm-2 col-form-label">Login</label>
                    <div class="form-group col-md-3 mb-2 ">    
                        <input type="text" class="form-control" name="login" placeholder="Veuillez Saisir Votre Login" id="login">
                    </div>

                </div>

                <div class="form-group row mb-2 ">

                    <label for="inputPassword"class="col-sm-2 col-form-label">Mot de passe</label>
                    <div class="col-sm-3">   <input type="password" class="form-control" name="password" id="password" placeholder="Veuillez Saisir Votre Mot de passe">
                    </div>


                </div>

                <div class="form-group col-md-6 mb-2">
                    <button type="submit" class="btn btn-primary">Valider </button>
                    <button type="submit" class="btn btn-danger"  onclick="reset()">Annuler</button>


                </div> 


            </div>

        </div>



</form>

</body>
</html>
