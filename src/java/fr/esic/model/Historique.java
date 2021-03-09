/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

public class Historique {
    private int idOperation;
    private String TypeOperation;
    private int montantOperation;

    private String dateOperation;
private Person person;
public Historique() {
    }

    public Historique(String TypeOperation, int montantOperation, String dateOperation, Person person) {
        this.TypeOperation = TypeOperation;
        this.montantOperation = montantOperation;
        this.dateOperation = dateOperation;
        this.person = person;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    public String getTypeOperation() {
        return TypeOperation;
    }

    public void setTypeOperation(String TypeOperation) {
        this.TypeOperation = TypeOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(int montantOperation) {
        this.montantOperation = montantOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

 
}