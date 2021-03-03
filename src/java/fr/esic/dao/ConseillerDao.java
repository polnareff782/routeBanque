/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Historique;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dylan55
 */
public class ConseillerDao {

    public static List<Histo> getHistorique(User p) throws SQLException {
        List<Histo> hist = new ArrayList();
        String sql = "";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        // prepare.setInt(1, getId());
        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {
            Historique n = new Historique();
            n.setId_Op(rs.getInt("numOp"));
            n.setLibelle_Op(rs.getString("libelleOp"));
            n.setMontant_Op(rs.getInt("montantOp"));
            n.setType_Op(rs.getString("typeOp"));
            n.setDate_Op(rs.getString("dateOp"));
            hist.add(hist);
        }

        return hist;

    }
}
