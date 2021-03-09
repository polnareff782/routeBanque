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

    /*  public static User getClientByLoginAndPassword(String login, String password) throws SQLException {

        User u = null;
        String sql = "select * from utilisateur where login=? and mdp=? and idrole=3";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new User();

            //c.setId(rs.getInt("idutilisateur"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            //c.setId(rs.getInt("idperson"));
            //c.setId(rs.getInt("idrole"));
        }

        return u;
    }*/
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

    public void ModifierUser(User c) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement("update person p set Adresse=?, Telephone=?,  where id= (SELECT id FROM utilisateur u WHERE u.id=p.id');");

          

            st.setString(1, c.getAdresse());
            st.setString(2, c.getTelephone());

            st.setInt(3, c.getId());

            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

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
