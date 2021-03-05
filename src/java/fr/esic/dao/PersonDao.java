/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Compte;
import fr.esic.model.Person;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marye
 */
public class PersonDao {

    public static Person getPersonByEmail(String mail) throws SQLException {

        Person p = null;
        String sql = "select * from person where email=?";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, mail);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            p = new Person();

            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setSexe(rs.getString("sexe"));
            p.setTelephone(rs.getString("telephone"));
            p.setEmail(rs.getString("email"));
            p.setAddress(rs.getString("adresse"));
            p.setDateNaissance(rs.getString("dateNaissance"));
        }
        return p;
    }

    public static Person getPersonById(String id) throws SQLException {

        Person p = null;
        String sql = "select * from person where idperson=?";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, id);
        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            p = new Person();

            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setSexe(rs.getString("sexe"));
            p.setTelephone(rs.getString("telephone"));
            p.setEmail(rs.getString("email"));
            p.setAddress(rs.getString("adresse"));
            p.setDateNaissance(rs.getString("dateNaissance"));
        }
        return p;
    }

    public static void insertPerson(Person p) throws SQLException {
        String sql = "INSERT INTO person (nom, prenom, telephone, sexe, dateNaissance, email, adresse) VALUES (?,?,?,?,?,?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, p.getNom());
        prepare.setString(2, p.getPrenom());
        prepare.setString(3, p.getTelephone());
        prepare.setString(4, p.getSexe());
        prepare.setString(5, p.getDateNaissance());
        prepare.setString(6, p.getEmail());
        prepare.setString(7, p.getAddress());
        prepare.execute();
        /* ResultSet RSid = prepare.getGeneratedKeys();
        RSid.next();
        return RSid.getInt(1);*/
    }

    public static List<Person> getAllPerson() throws SQLException {

        List<Person> persons = new ArrayList<>();

        String sql = "SELECT * FROM person";

        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();

        ResultSet rs = requete.executeQuery(sql);
        while (rs.next()) {
            Person u = new Person();

            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setTelephone(rs.getString("telephone"));

            u.setSexe(rs.getString("sexe"));

            //u.setDateNaissance(rs.getString("dateNaissance"));
            u.setEmail(rs.getString("email"));
            u.setAddress(rs.getString("adresse"));

            persons.add(u);
        }
        return persons;
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

}
