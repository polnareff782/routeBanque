/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

/**
 *
 * @author dylan55
 */
public class Historique {
    private int id_Op;
    private String libelle_Op;
    private int montant_Op;
    private String type_Op;
    private String date_Op;

public Historique() {
    }

    public Historique(int id_Op, String libelle_Op, int montant_Op, String type_Op, String date_Op) {
        this.id_Op = id_Op;
        this.libelle_Op = libelle_Op;
        this.montant_Op = montant_Op;
        this.type_Op = type_Op;
        this.date_Op = date_Op;
    }

    public int getId_Op() {
        return id_Op;
    }

    public void setId_Op(int id_Op) {
        this.id_Op = id_Op;
    }

    public String getLibelle_Op() {
        return libelle_Op;
    }

    public void setLibelle_Op(String libelle_Op) {
        this.libelle_Op = libelle_Op;
    }

    public int getMontant_Op() {
        return montant_Op;
    }

    public void setMontant_Op(int montant_Op) {
        this.montant_Op = montant_Op;
    }

    public String getType_Op() {
        return type_Op;
    }

    public void setType_Op(String type_Op) {
        this.type_Op = type_Op;
    }

    public String getDate_Op() {
        return date_Op;
    }

    public void setDate_Op(String date_Op) {
        this.date_Op = date_Op;
    }

    
}