/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

import java.util.Date;

/**
 *
 * @author marye
 */
public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String login;
    private String password;

    private String telephone;
    private String sex;
    private String datenaissance;
    private int type;
    private String email;
    private String Adresse;

    public Client() {
    }

    public Client(String nom, String prenom,String telephone, String sex, String datenaissance, String email, String Adresse) {
        this.nom = nom;
        this.prenom = prenom;

       
        this.telephone = telephone;
        this.sex = sex;
        this.datenaissance = datenaissance;
        this.email = email;
        this.Adresse = Adresse;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

   
    public String getTelephone() {
        return telephone;
    }

    public String getSex() {
        return sex;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public int getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

}