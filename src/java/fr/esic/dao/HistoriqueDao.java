/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Historique;
import fr.esic.model.Operation;
import fr.esic.model.Person;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.Date;
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
public class HistoriqueDao {

    public static void AjouterOperation(String type,int montantOperation, int idperson) throws SQLException {

        String sql = "insert into historique(typeOperation,MontantOperation,person_idperson) values (?,?,?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);

        prepare.setString(1, type);
        prepare.setInt(2, montantOperation);
        prepare.setInt(3, idperson);
        prepare.execute();
       
    }
            public  static List<Historique> getAllOperations() throws SQLException{
      List<Historique>ListeOperations = new ArrayList<>();
        
      String sql = "SELECT  idperson,nom,prenom,typeOperation, dateOperation,MontantOperation "
              + "FROM historique h inner join person p"
              + " on h.person_idperson=p.idperson order by dateOperation desc";
        
      Connection connexion = AccessBd.getConnection();
        
        Statement st =  connexion.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            Historique h = new Historique();
            h.setTypeOperation(rs.getString("typeOperation"));
            h.setDateOperation(rs.getString("dateOperation"));
            h.setMontantOperation(rs.getInt("MontantOperation"));

            Person p = new Person();
            
p.setId(rs.getInt("idperson"));
             p.setNom(rs.getString("nom"));
            
int x=17;         
              
              ListeOperations.add(h);
            
        }
        return ListeOperations;
    }

}
