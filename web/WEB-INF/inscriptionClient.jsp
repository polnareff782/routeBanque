<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel = "preconnect" href = "https://fonts.gstatic.com">
        <link href = "https://fonts.googleapis.com/css2? family = Akaya + Kanadaka & display = swap" rel = "feuille de style">
        <script type="text/javascript" src="app.js"></script>

        <title>InscriptionClintBnaqueRoute</title> 


    </head>

    <body>
        <div class="container mt-4">
            <form action="InscriptionClient" method="POST">

                <div class="row "> 
                    <div class=" title col-md-6 ">
                        <h4> BIENVENUE PARMIS NOUS</h4>
                        <br><br><br><br> <br>
                        <img src ="img/inscriptionclient.jpg">

                    </div>
                    <div class="col-md-4">
                        <br><br><br>
                        <h6 class="petit-title"><span>Veuillez Remplir le formulaire! 
                            Tous les champs sont obligatoires</span></h6>
                        <br>


                        <div class="row g-3">
                            <div class="col-md-6">
                                <label for="inputNom" class="form-label">Nom</label>
                                <input type="text" id="nom" class="form-control" name="nom" required>
                            </div>
                            <div class="col-md-6">
                                <label for="inputprenom" class="form-label">Prenom</label>
                                <input type="text" id="prenom" class="form-control" name="prenom" required>
                            </div>
                        </div>



                        <div class="row mb-3 mt-2">
                            <div class="col-md-6">
                                <label for="login" class="form-label">Login</label>
                                <input type="text" id="login" class="form-control" name="login" required>
                            </div>

                            <div class="col-md-6">
                                <label for="mdp" class="form-label">Password </label>
                                <input type="password" id="mdp" class="form-control" name="mdp" required >
                            </div>

                        </div>

                        <div class="row mb-3 mt-2">

                            <div class="col-md-6">
                                <label for="telephone" class="form-label">Téléphone</label>
                                <input type="text" id="login" class="form-control" name="telephone" required>

                            </div>
                            <div class="col-md-6">
                                <label class="form-label">Civilité</label>
                                <br>
                                <input  type="radio" name="sexe" value="femme" required>
                                <label  >Madame</label>
                                
                                <input  type="radio" name="sexe" value="homme" required>
                                <label  >Monsieur</label>

                            </div>
                        </div>



                        <!--<div class="row mb-3 mt-2">
                            <label for="sexe" class="my-label">Sexe</label>
                            <input type="text" id="sexe" class="form-control" name="sexe">
                        </div> -->


                        <div class="row mb-3 mt-2">
                            <div class="col-md-6">
                            <label for="dateNaissance" class="form-label">Date de naissance</label>
                            <input type="date" id="dateNaissance" class="form-control" name="dateNaissance" required>
                            </div>
                            <div class="col-md-6">
                            <label for="email" class="form-label">Email</label>
                              <input type="email" id="email" class="form-control" name="email"required>
                            </div>
                        </div>

                        <div class="row mb-3 mt-2">
                            <label for="adresse" class="col-sm-2 form-label">Adresse</label>
                            <div class="col-sm-12 mb-2">

                                <input type="text"  class="form-control" name="adresse" required>
                            </div>
                        </div>

                        <button type="reset" class="btn btn-danger">Annuler</button>
                        <button type="submit" class="btn btn-primary btn-block" onclick="location.href = 'inscription'">Valider</button>
                        <button type="button" class="btn btn-success btn-block" onclick="location.href = 'login'">Se connecter</button>
                           
                        

                        <p class="text-center text-danger" id="msg"> ${msg} </p>
                    </div>
                </div>

            </form>
        </div>
    </body>
</html>
