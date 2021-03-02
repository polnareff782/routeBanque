<%-- 
    Document   : inscription
    Created on : 19 févr. 2021, 15:16:30
    Author     : polnareff
--%>

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
       <div class="container mt-4">
            <form action="inscription" method="POST">
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
