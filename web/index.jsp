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
        <title>BanqueRoute</title>
        <link rel="stylesheet" href="css/style.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Caveat:wght@500&display=swap" rel="stylesheet">
    </head>


    <body style="background-color:white;">
        <div class="argent">
            <div>
                <h1><span style="color: red;
                          text-decoration: underline;

                          text-align: center;
                          text-shadow: -1px 0 0 rgba(0, 0, 0, 0.8), 
                          1px 0 0 rgba(0, 0, 0, 0.8),
                          0 -1px 0 rgba(0, 0, 0, 0.8),
                          0 1px 0 rgba(0, 0, 0, 0.8);">
                        BanqueRoute</span>
                </h1>
                <p>la banque de la hess</p>
            </div>
            <div class="container mt-4 " style="background-color: #fff9ed">
                <form action="login" method="POST">
                    <div class="content-login">

                        <h5 class="card-title-perso text-center "><span class="connexion"> Connexion </span></h5>
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
                                <button type="button" class="btn btn-primary" onclick="location.href = 'InscriptionClient'">S'inscrire</button>
                            </div>

                            <p class="text-center text-danger" id="msg"> ${msg} </p>
                        </div>
                    </div>

            </div>
        </div>
    </form>
</div>
</div>
</body>

</html>
