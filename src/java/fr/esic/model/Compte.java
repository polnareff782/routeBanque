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
    private String numcarte;
    public boolean etatcarte;
    private boolean opposition;
    private String operation;

    private Date date_expiration;
    private String typeOperation;
    private Date dateOperation;
    private int montantDecouvert;

    private User user;
    private Person person;

    public Compte() {

    }

    public Compte(int id, String numcompte, String solde, String numcarte, boolean etatcarte,boolean opposition ,String operation, Date date_expiration, String typeOperation, Date dateOperation, int montantDecouvert, User user, Person person) {
        this.id = id;
        this.numcompte = numcompte;
        this.solde = solde;
        this.numcarte = numcarte;
        this.etatcarte = etatcarte;
        this.opposition = opposition;  
        this.operation = operation;
        this.date_expiration = date_expiration;
        this.typeOperation = typeOperation;
        this.dateOperation = dateOperation;
        this.montantDecouvert = montantDecouvert;
        this.user = user;
        this.person = person;
    }

    public Compte(String numcompte, String solde, String numcarte, boolean etatcarte,boolean opposition ,String operation, Date date_expiration, String typeOperation, Date dateOperation, int montantDecouvert, User user, Person person) {
        this.numcompte = numcompte;
        this.solde = solde;
        this.numcarte = numcarte;
        this.etatcarte = etatcarte;
        this.opposition = opposition;  
        this.operation = operation;
        this.date_expiration = date_expiration;
        this.typeOperation = typeOperation;
        this.dateOperation = dateOperation;
        this.montantDecouvert = montantDecouvert;
        this.user = user;
        this.person = person;
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

    public boolean isOpposition() {
        return opposition;
    }

    public void setOpposition(boolean opposition) {
        this.opposition = opposition;
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

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontantDecouvert() {
        return montantDecouvert;
    }

    public void setMontantDecouvert(int montantDecouvert) {
        this.montantDecouvert = montantDecouvert;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
