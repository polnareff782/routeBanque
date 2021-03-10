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
public class Person {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String sexe;
    private String dateNaissance;
    private String email;
    private String address;

    public Person() {
    }

    public Person(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    
    
    public Person(int id, String nom, String prenom, String telephone, String sexe, String dateNaissance, String email, String address) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.address = address;
    }

    public Person(String nom, String prenom, String telephone, String sexe, String dateNaissance, String email, String address) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
