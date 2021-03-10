<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
     <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>AC MILAN</title>
        <link rel="stylesheet" href="css/style.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
   
    <body>
        
         <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">CDA 2020</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav nav-fill w-100">
                        <li class="nav-item active">
                            <a class="nav-link" href="AccueilServlet">Accueil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Deco"><span class="material-icons red600">
                                    logout
                                </span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        
       <div class="container mt-4">
            <form action="InscriptionConseillerServlet" method="POST">
                <div class="content-login">
                    <div class="card shadow-card">
                        <div class="card-header card-header-back">
                            <h5 class="card-title-perso text-center"> Inscription</h5>
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
                                <div class="mb-3">
                                    <label for="sexe" class="my-label">Sexe</label>
                                    <input type="text" id="sexe" class="form-control" name="sexe">
                                </div>
                                <div class="mb-3">
                                    <label for="dateNaissance" class="my-label">Date de naissance</label>
                                    <input type="date" id="dateNaissance" class="form-control" name="dateNaissance">
                                </div>
                                <div class="mb-3">
                                    <label for="email" class="my-label">EMail</label>
                                    <input type="mail" id="email" class="form-control" name="email">
                                </div>
                                <div class="mb-3">
                                    <label for="adresse" class="my-label">Adresse</label>
                                    <input type="text" id="sexe" class="form-control" name="adresse">
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
