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

public class ConseillerDao {
    
    public static void insertConseiller(User c) throws SQLException {
        String sql = "INSERT INTO utilisateur (login, mdp, idperson, idrole) VALUES (?, ?, ?, 2)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, c.getLogin());
        prepare.setString(2, c.getMdp());
        prepare.setInt(3, c.getPerson().getId());
        prepare.execute();
    }
    
    
    
   /* public static User getConseillerByLoginAndPassword(String log, String mdp) throws SQLException {
        User u = null;
        String sql = "SELECT * FROM utilisateur WHERE login=? AND mdp=? WHERE idrole=2";
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
    
}
