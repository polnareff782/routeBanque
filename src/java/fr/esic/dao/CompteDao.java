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
public class CompteDao {

    public static Compte getAllCompte(Person p) throws SQLException {

        Compte c = null;

        String sql = "    SELECT \n"
                + "    p.idperson,\n"
                + "    nom,\n"
                + "    prenom,\n"
                + "    solde,\n"
                + "    numCp,\n"
                + "    numCarte,\n"
                + "    etat,\n"
                + "    opposition,\n"
                + "    operation,\n"
                + "    dateExpiration,\n"
                + "    typeOperation,\n"
                + "    dateOperation,\n"
                + "    montantDecouvert\n"
                + "FROM\n"
                + "    compte c\n"
                + "        INNER JOIN\n"
                + "    person p ON c.person_idperson = p.idperson\n"
                + "WHERE\n"
                + "    p.idperson = ?";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, p.getId());

        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {
            c = new Compte();
            c.setSolde(rs.getString("solde"));
            c.setNumcompte(rs.getString("numCp"));
            c.setNumcarte(rs.getString("numCarte"));
            c.setEtatcarte(rs.getBoolean("etat"));
            c.setOpposition(rs.getBoolean("opposition"));
            c.setOperation(rs.getString("operation"));
            c.setDate_expiration(rs.getDate("dateExpiration"));
            c.setDateOperation(rs.getDate("dateOperation"));
            c.setMontantDecouvert(rs.getInt("montantDecouvert"));

            Person u = new Person();
            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            c.setPerson(u);

        }
        return c;
    }

    public static void ActiveCarte(int numcarte) throws SQLException {
        String sql = "Update compte set etat=1 WHERE numcarte=?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, numcarte);
        prepare.execute();
    }

    public static void DesactiverCarte(int numcarte) throws SQLException {
        String sql = "Update compte set etat=0 WHERE numcarte=?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, numcarte);
        prepare.execute();
    }
    public static void Solde(int solde,String type,int numcarte)throws SQLException{
    String sql="update compte set solde =? , typeOperation=? where numcarte=?";
    Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, solde);
        prepare.setString(2, type);
        prepare.setInt(3, numcarte);
        prepare.execute();
     
    }
  
     public static void OppositionCarte(int numcarte) throws SQLException {
        String sql = "Update compte set opposition=1,etat=0 WHERE numcarte=?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, numcarte);
        prepare.execute();
    }
     
       public static void demandedecouvert(int montant, int numcarte) throws SQLException {
        String sql = "Update compte set montantDecouvert=? WHERE numcarte=?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, montant);
        prepare.setInt(2, numcarte);
        prepare.execute();
}
}