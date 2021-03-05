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
    
  public  static List<Compte> getAllCompte(Person p) throws SQLException{
      List<Compte> com = new ArrayList<>();
        
      String sql = "select idperson, nom,prenom,solde,numCp,numcarte,operation,date_expiration from person, compte where idperson = person_idperson and person_idperson = ?";
        Connection connexion = AccessBd.getConnection();
        
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, p.getId());
        
        ResultSet rs = prepare.executeQuery();
        
        while (rs.next()) {
            Compte c = new Compte();
            c.setSolde(rs.getString("solde"));
            c.setNumcompte(rs.getString("numcompte"));
            c.setNumcarte(rs.getString("numcarte"));
            c.setOperation(rs.getString("operation"));
            c.setDate_expiration(rs.getDate("Date_expiration"));
            
             Person u = new Person();
              u.setId(rs.getInt("idperson"));
              u.setNom(rs.getString("nom"));
              u.setPrenom(rs.getString("prenom"));
              
              
              com.add(c);
            
        }
        return com;
    }
    
        
           
          
        public static List<Compte> getALLCompteactivé() throws SQLException{
        List<Compte> comptes = new ArrayList<>();
        
        String sql ="SELECT * FROM compte where etatcarte=1 and person_idperson=?";
        Connection connexion = AccessBd.getConnection();
        
           Statement st = connexion.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            Compte c = new Compte();
            c.setId(rs.getInt("idcompte"));
            c.setSolde(rs.getString("solde"));
            c.setNumcompte(rs.getString("numcompte"));
            c.setNumcarte(rs.getString("numcarte"));
            c.setOperation(rs.getString("opration"));
            c.setDate_expiration(rs.getDate("Date_expiration"));
            
            comptes.add(c);
        }
        
        return comptes;
    }
            public static List<Compte> getAllComptedesactivé() throws SQLException{
        List<Compte> comptes = new ArrayList<>();
        
        String sql ="SELECT idcompte  ,numcompte,solde ,numcarte ,operation ,Date_expiration, if(etatcarte,'true','false') etat FROM compte where etatcarte=false";
        Connection connexion = AccessBd.getConnection();
        
           Statement st = connexion.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            Compte c = new Compte();
            c.setId(rs.getInt("idcompte"));
            c.setSolde(rs.getString("solde"));
            c.setNumcompte(rs.getString("numcompte"));
            c.setNumcarte(rs.getString("numcarte"));
            c.setOperation(rs.getString("paiement"));
            c.setDate_expiration(rs.getDate("Date_expiration"));
            
            comptes.add(c);
        }
        
        return comptes;
        
    }
            public static List<Compte> allClientActive() throws SQLException{
         List<Compte> comptes = new ArrayList<>();
        
        String sql ="SELECT idcompte ,numCp,solde, numcarte ,operation ,Date_expiration, if(etatcarte,'true','false') etat FROM compte where etatcarte=true";
        Connection connexion = AccessBd.getConnection();
        
           Statement st = connexion.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
                while(rs.next()){
            Compte c = new Compte();
            c.setId(rs.getInt("idcompte"));
            c.setNumcompte(rs.getString("numcompte"));
            c.setSolde(rs.getString("solde"));
            c.setNumcarte(rs.getString("numcarte"));
            c.setOperation(rs.getString("operation"));
            c.setDate_expiration(rs.getDate("Date_expiration"));
            
            comptes.add(c);
        }
        
        return comptes;
            }
            
            public static void ActiveCompte (int numcarte) throws SQLException{
           String sql ="Update compte set etatcarte=1 WHERE numcarte=?";
           Connection connexion = AccessBd.getConnection();
           PreparedStatement prepare = connexion.prepareStatement(sql);
           prepare.setInt(1, numcarte);
           prepare.execute();
       }
            
           public static void DesactiverCompte (int numcarte) throws SQLException{
           String sql ="Update compte set etatcarte=0 WHERE numcarte=?";
           Connection connexion = AccessBd.getConnection();
           PreparedStatement prepare = connexion.prepareStatement(sql);
           prepare.setInt(1, numcarte);
           prepare.execute();
       }
    
}
