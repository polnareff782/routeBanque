<%-- 
    Document   : index
    Created on : 12 févr. 2021, 15:44:36
    Author     : polnareff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>BanqueRoute.html</title>
        <link rel="stylesheet" href="css/style.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>

    <body>
        <br><br><br><br><br>
        <div class="container mt-4">
            <form action="login" method="POST">
                <div class="content-login">
                    <div class="card shadow-card">
                        <div class="card-header card-header-back">
                            <h5 class="card-title-perso text-center"> Connexion</h5>
                        </div>
                        <div>
                            <div class="card-body">
                                <div class="mb-3">
                                    <label for="login" class="my-label">Login</label>
                                    <input type="text" required id="login" class="form-control" name="login">
                                </div>
                                <div class="mb-3">
                                    <label for="login" class="my-label">Password</label>
                                    <input type="password"  required id="mdp" class="form-control" name="mdp">
                                </div>
                                <div class="d-grid gap-2">
                                    <button type="submit" class="btn btn-success btn-block">Valider</button>
                                   <!-- <button type="button" class="btn btn-primary btn-block" onclick="location.href='inscription'">Inscription</button> -->
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
