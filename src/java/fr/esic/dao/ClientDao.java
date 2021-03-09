package fr.esic.dao;

import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {


    public static void insertClient(User c) throws SQLException {
        String sql = "INSERT INTO utilisateur (login, mdp, idperson, idrole) VALUES (?, ?, ?, 3)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, c.getLogin());
        prepare.setString(2, c.getMdp());
        prepare.setInt(3, c.getPerson().getId());

        prepare.execute();
    }


/*
    public static User getEmail(String login, String password) throws SQLException {

        User c = null;
        String sql = "SELECT p.email FROM banque.person p inner join banque.utilisateur u Where p.idperson = u.idutilisateur and u.idrole = 2";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            c = new User();

            c.setEmail(rs.getString("email"));
        }

        return c;
    }
     */
}
