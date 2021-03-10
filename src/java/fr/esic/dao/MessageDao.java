/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Historique;
import fr.esic.model.User;
import fr.esic.model.Message;
import fr.esic.model.Person;
import fr.esic.model.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huawei
 */
public class MessageDao {

    public static void InsertMessage(String contenu, int id) throws SQLException {
        String sql = "INSERT INTO Message ( contenuMessage, person_idperson) VALUES (?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, contenu);
        prepare.setInt(2, id);
        prepare.execute();

    }

    /*conseiller*/
    public static void AfficheMessageClient(int id) throws SQLException {
        String sql = "SELECT contenu FROM message where person_idperson=? order by date_message;";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, id);
        prepare.execute();

    }/*affiche tt les msg  dee cjhaque clint pour conseiller */
    public static List<Message> AfficheContenu(int id) throws SQLException {
        List<Message> message = new ArrayList<>();
        String sql = "SELECT  idperson,nom,prenom , contenuMessage FROM message,person where person_idperson=idperson and idperson=?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, id);
        ResultSet rs = prepare.executeQuery();
        while (rs.next()) {
            Message m = new Message();
            m.setContenuMessage(rs.getString("contenuMessage"));
            Person p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));

            m.setPerson(p);

            message.add(m);

        }
        return message;

    }

    /* affch msg de client pr coneilller */
    public static List<Message> getMessageStaff() throws SQLException {
        List<Message> message = new ArrayList<>();

        String sql = "SELECT  idperson,nom,prenom ,login , contenu FROM message,person where person_idperson=idperson and type='client'";
        Connection connexion = AccessBd.getConnection();

        Statement st = connexion.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Message m = new Message();
            m.setContenuMessage(rs.getString("contenu"));
            Person p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            //u.setLogin(rs.getString("login"));
            m.setPerson(p);

            message.add(m);

        }
        return message;
    }

    /*recup tt msg conse pour client*/
    public static List<Message> getMessageConseiller() throws SQLException {
        List<Message> message = new ArrayList<>();

        String sql = "select  contenuMessage,dateMessage from message m,utilisateur u,person p,role r \n"
                + "where m.person_idperson=p.idperson \n"
                + "and p.idperson=u.idperson\n"
                + "and u.idrole=r.idrole\n"
                + "and r.idrole=2; ";
        Connection connexion = AccessBd.getConnection();

        Statement st = connexion.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Message m = new Message();
            m.setContenuMessage(rs.getString("contenuMessage"));
               m.setDateMessage(rs.getDate("datemessage"));
               
            User u =new User();
            Role r=new Role();
            Person p = new Person();
            
//            p.setId(rs.getInt("idperson"));
//            p.setNom(rs.getString("nom"));
//            p.setPrenom(rs.getString("prenom"));
            m.setPerson(p);

            message.add(m);

        }
        return message;
    }

    /*insert msg conseiler*/
    public static void InsertMessageConseiller(String contenu, int id) throws SQLException {
        String sql = "INSERT INTO Message ( contenu , person_idperson) VALUES (?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, contenu);
        prepare.setInt(2, id);
        prepare.execute();

    }

}
