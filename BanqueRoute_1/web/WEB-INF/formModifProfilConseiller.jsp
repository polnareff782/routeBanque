<%-- 
    Document   : formModifProfilConseiller
    Created on : 4 mars 2021, 23:27:22
    Author     : Nathan Ghozlan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--    FORMULAIRE MODIF PROFIL -->
        
        <form action="ModifProfil" method="POST">
            <div class="content-login">
                <div class="card shadow-card">
                    <div class="card-header card-header-back">
                        <h5 class="card-title-perso text-center"> Modifier profil conseiller</h5>
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
                                <button type="submit" class="btn btn-primary btn-block">Modifier profil</button>
                                <button type="reset" class="btn btn-danger btn-block">Annuler</button>

                            </div>




        <p class="text-center text-danger" id="msg"> ${msg} </p>
    </div>
</div>

</div>
</div>
</form>
        
    </body>
</html>
