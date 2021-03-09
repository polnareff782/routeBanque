/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dylan55
 */
public class AdminDao {

    /*Pas besoin. une connexion d'un user doit ou contient toutes les info du user peu importe le role
      public static User getAdminByLoginAndPassword(String log, String mdp) throws SQLException {
        User u = null;
        String sql = "SELECT * FROM utilisateur WHERE login=? AND mdp=? WHERE idrole=1";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, log);
        prepare.setString(2, mdp);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new User();
            u.setIdUtil(rs.getInt("idutilisateur"));
            u.setLogin(rs.getString("login"));
            u.setPassword(rs.getString("mdp"));
            u.setIdPerson(rs.getInt("idperson"));
            u.setIdRole(rs.getInt("idrole"));
        }

        return u;
    }*/
    public static void insertAdmin(User admin) throws SQLException {
        String sql = "INSERT INTO utilisateur (login, mdp, idperson, idrole, statut) VALUES (?, ?, ?, 1, 1)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, admin.getLogin());
        prepare.setString(2, admin.getMdp());
        prepare.setInt(3, admin.getPerson().getId());
        prepare.execute();
    }
}
