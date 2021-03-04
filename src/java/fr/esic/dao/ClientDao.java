package fr.esic.dao;

import fr.esic.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    public static Client getByLoginAndPassword(String login, String password) throws SQLException {

        Client c = null;
        String sql = "select * from utilisateur where login=? and mdp=? ";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            c = new Client();
            
            //c.setId(rs.getInt("idutilisateur"));
            c.setLogin(rs.getString("login"));
            c.setPassword(rs.getString("mdp"));
            //c.setId(rs.getInt("idperson"));
            //c.setId(rs.getInt("idrole"));
        }

        return c;
    }

    public static void insertPerson(Client c) throws SQLException {
        String sql = "insert into person(nom,prenom,telephone,sexe,dateNaissance,email,adresse) values(?,?,?,?,?,?,?)";

        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareCall(sql);
        prepare.setString(1, c.getNom());
        prepare.setString(2, c.getPrenom());
        
        prepare.setString(3, c.getTelephone());
        prepare.setString(4, c.getSex());
        prepare.setString(5, c.getDatenaissance());
        prepare.setString(6, c.getEmail());
        prepare.setString(7, c.getAdresse());

        prepare.execute();
    }

    

    public static List<Client> getAll() throws SQLException {
        List<Client> clients = new ArrayList<>();
        String sql = "select * from person";

        Connection connexion = AccessBd.getConnection();
        Statement ST = connexion.createStatement();
        ResultSet rs = ST.executeQuery(sql);

        while (rs.next()) {
            Client c = new Client();
            c.setId(rs.getInt("idperson"));
            c.setPrenom(rs.getString("nom"));
            c.setNom(rs.getString("prenom"));
            c.setLogin(rs.getString("login"));

            clients.add(c);
        }
        return clients;
    }

    public void ModifierClient(Client c) {
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

    public static Client getEmail(String login, String password) throws SQLException {

        Client c = null;
        String sql = "SELECT p.email FROM banque.person p inner join banque.utilisateur u Where p.idperson = u.idutilisateur and u.idrole = 2";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            c = new Client();

            c.setEmail(rs.getString("email"));
        }

        return c;
    }

}

