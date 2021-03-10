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
    
    public static Person getPersonByNom(String nom) throws SQLException {

        Person p = null;
        String sql = "select * from person where nom=?";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setString(1, nom);
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

    public static Person getPersonById(int id) throws SQLException {

        Person p = null;
        String sql = "select * from person where idperson=?";
        Connection conn = AccessBd.getConnection();

        PreparedStatement prepare = conn.prepareStatement(sql);
        prepare.setInt(1, id);
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
    }

    public static void UpdatePerson(Person p) throws SQLException {
        String sql = "UPDATE person SET nom = ?, prenom = ?, telephone = ?, sexe = ?, dateNaissance = ?, email = ?, adresse = ? WHERE idperson = ?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, p.getNom());
        prepare.setString(2, p.getPrenom());
        prepare.setString(3, p.getTelephone());
        prepare.setString(4, p.getSexe());
        prepare.setString(5, p.getDateNaissance());
        prepare.setString(6, p.getEmail());
        prepare.setString(7, p.getAddress());
        prepare.setInt(8, p.getId());
        System.out.println("idpers:" + p.getId());

        prepare.execute();

    }

    /*
    public static void UpdatePerson(String nom, String prenom, String telephone, String sexe, String dateNaissance, String email, String adresse, int id) throws SQLException {
        String sql = "UPDATE `person` SET nom = ?, prenom = ?, telephone = ?, sexe = ?, dateNaissance = ?, email = ?, adresse = ? `adresse` = ? WHERE `person`.`idperson` = ?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, nom);
        prepare.setString(2, prenom);
        prepare.setString(3, telephone);
        prepare.setString(4, sexe);
        prepare.setString(5, dateNaissance);
        prepare.setString(6, email);
        prepare.setString(7, adresse);
        prepare.setInt(8, id);

        prepare.execute();

    }
     */
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

}
