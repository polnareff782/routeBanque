package fr.esic.dao;

import fr.esic.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static User getByLoginAndPassword(String log, String mdp) throws SQLException {
        User u = null;
        String sql = "SELECT * FROM person WHERE login=? AND mdp=?";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, log);
        prepare.setString(2, mdp);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new User();
            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            u.setPassword(rs.getString("mdp"));
        }

        return u;
    }

    
    public static void insertPerson(User u) throws SQLException {
        String sql = "INSERT INTO person (nom, prenom, login, mdp, telephone, sexe, dateNaissance, eMail, adresse) VALUES (?,?,?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getLogin());
        prepare.setString(4, u.getPassword());
        prepare.setString(5, u.getTelephone());
        prepare.setString(6, u.getSexe());
        prepare.setString(7, u.getDateNaissance());
        prepare.setString(8, u.getMail());
        prepare.setString(9, u.getAdresse());
        prepare.execute();
    }
    
    public static void insertConseiller(User u) throws SQLException {
        String sql = "INSERT INTO conseiller (idperson) VALUES (?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, u.getId());
        prepare.execute();
    }


    public static List<User> getAll() throws SQLException {

        List<User>users = new ArrayList<>();

        String sql = "SELECT * FROM person";

        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();

        ResultSet rs = requete.executeQuery(sql);
        while (rs.next()) {
            User u = new User();

            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            u.setPassword(rs.getString("mdp"));
            users.add(u);
        }
        return users;
    }

    
}
