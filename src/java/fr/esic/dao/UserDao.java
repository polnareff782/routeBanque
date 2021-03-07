package fr.esic.dao;

import fr.esic.model.Compte;
import fr.esic.model.Person;
import fr.esic.model.Role;
import fr.esic.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    
    public static User getByLoginAndPassword(String log, String mdp) throws SQLException {
        User u = null;
        String sql = "SELECT * FROM utilisateur u INNER JOIN person p ON p.idperson = u.idperson WHERE login=? AND mdp=? AND statut = 1";
        Connection connexion = AccessBd.getConnection();
        
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, log);
        prepare.setString(2, mdp);
        
        ResultSet rs = prepare.executeQuery();
        
        if (rs.next()) {
            u = new User();
            u.setId(rs.getInt("idutilisateur"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            
            Person p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            u.setPerson(p);
            
            Role r = new Role();
            r.setId(rs.getInt("idrole"));
            u.setRole(r);
        }
        
        return u;
    }
    
    public static User getUserById(int id) throws SQLException {

        User u = null;
        String sql = "SELECT * FROM utilisateur u INNER JOIN person p ON p.idperson = u.idperson where u.idutilisateur=?";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setInt(1, id);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new User();
            u.setId(rs.getInt("idutilisateur"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            
            Person p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            u.setPerson(p);
            
            Role r = new Role();
            r.setId(rs.getInt("idrole"));
            u.setRole(r);
            
        }
        return u;
    }
    
    public static List<Person> getAllClient() throws SQLException {
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT p.idperson, p.nom, p.prenom, p.email, p.adresse, u.login, c.solde, c.numCp, c.etat FROM person p INNER JOIN utilisateur u ON u.idperson = p.idperson INNER JOIN compte c ON p.idperson = u.idperson AND p.idperson = c.person_idperson WHERE idRole = 3";
        Connection connexion = AccessBd.getConnection();
        Statement requete = connexion.createStatement();
        ResultSet rs = requete.executeQuery(sql);
        while (rs.next()) {
            Person u = new Person();
            Compte c = new Compte();
            User a = new User();

            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setTelephone(rs.getString("telephone"));
            u.setId(rs.getInt("idperson"));
            u.setSexe(rs.getString("sexe"));
            c.setSolde(rs.getString("solde"));
            a.setLogin(rs.getString("login"));
            c.setNumcompte(rs.getString("numCp"));
            c.setEtatcarte(rs.getBoolean("etat"));
            u.setEmail(rs.getString("email"));
            u.setAddress(rs.getString("adresse"));
            a.setLogin(rs.getString("login"));

            persons.add(u);
        }
        return persons;
    }

    /* public static int insertPerson(User u) throws SQLException {
        String sql = "INSERT INTO person (nom, prenom, telephone, sexe, dateNaissance, eMail, adresse) VALUES (?,?,?,?,?,?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getTelephone());
        prepare.setString(4, u.getSexe());
        prepare.setString(5, u.getDateNaissance());
        prepare.setString(6, u.getMail());
        prepare.setString(7, u.getAdresse());
        prepare.execute();
        
        ResultSet RSid = prepare.getGeneratedKeys();
        RSid.next();
        return RSid.getInt(1);
    }*/
 
    public static List<User> getAll() throws SQLException {

        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM utilisateur";

        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();

        ResultSet rs = requete.executeQuery(sql);
        while (rs.next()) {
            User u = new User();

            u.setId(rs.getInt("idperson"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            
            users.add(u);
        }
        return users;
    }

    public static void ActiverClient (String log) throws SQLException{
           String sql ="Update person set etat=1 WHERE login=?";
           Connection connexion = AccessBd.getConnection();
           PreparedStatement prepare = connexion.prepareStatement(sql);
           prepare.setString(1, log);
           prepare.execute();
       }
           public static void DesactiverClient (String log) throws SQLException{
           String sql ="Update person set etat=0 WHERE login=?";
           Connection connexion = AccessBd.getConnection();
           PreparedStatement prepare = connexion.prepareStatement(sql);
           prepare.setString(1, log);
           prepare.execute();   
       }
           
           public static User AfficheUser (int id) throws SQLException {    
              User u = null;
              Person p = null;
          String  sql = "select * from person where idperson=?"; 
          String  sqla = "select * from person where idperson=?";       

         Connection connexion = AccessBd.getConnection();
         PreparedStatement prepare = connexion.prepareStatement(sql);
         PreparedStatement preparer = connexion.prepareStatement(sqla);
         
         prepare.setInt(1,id);
   
        ResultSet rs = prepare.executeQuery();
        
        if(rs.next()){
            u = new User();
            p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            
        }
        
        return u;
    }
     
}
