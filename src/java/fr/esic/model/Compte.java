/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

import java.sql.Date;

/**
 *
 * @author marye
 */
public class Compte {
      private int id;
    
    private String numcompte;
    private String solde;
  public static double soldeepargne=500.00 ;
    private String libelleCp;
    private String numcarte;
    private boolean etatcarte;
    private String operation;
   
    private Date date_expiration;
    private String typeOperation;
    private String dateOperation;
    
    private User user;
    
    public Compte (){
    
          }

    public Compte(String solde, String libelleCp, boolean etatcarte, String operation, Date date_expiration, String typeOperation, String dateOperation, User user) {
        this.solde = solde;
        this.libelleCp = libelleCp;
        this.etatcarte = etatcarte;
        this.operation = operation;
        this.date_expiration = date_expiration;
        this.typeOperation = typeOperation;
        this.dateOperation = dateOperation;
        this.user = user;
    }

    public Compte(String numcompte, String solde, String libelleCp, String numcarte, boolean etatcarte, String operation, Date date_expiration, String typeOperation, String dateOperation, User user) {
        this.numcompte = numcompte;
        this.solde = solde;
        this.libelleCp = libelleCp;
        this.numcarte = numcarte;
        this.etatcarte = etatcarte;
        this.operation = operation;
        this.date_expiration = date_expiration;
        this.typeOperation = typeOperation;
        this.dateOperation = dateOperation;
        this.user = user;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(String numcompte) {
        this.numcompte = numcompte;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getLibelleCp() {
        return libelleCp;
    }

    public void setLibelleCp(String libelleCp) {
        this.libelleCp = libelleCp;
    }

    public String getNumcarte() {
        return numcarte;
    }

    public void setNumcarte(String numcarte) {
        this.numcarte = numcarte;
    }

    public boolean isEtatcarte() {
        return etatcarte;
    }

    public void setEtatcarte(boolean etatcarte) {
        this.etatcarte = etatcarte;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    

}