/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Person;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
