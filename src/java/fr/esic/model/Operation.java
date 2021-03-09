/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

/**
 *
 * @author marye
 */
public class Operation {
    
      
	private int idOperation;
	private String typeOperation;
	private int montantOperation;
	private String dateOperation;
        private Person person;

    public Operation() {
    }

    public Operation(String typeOperation, int montantOperation, String dateOperation,Person person) {
        this.typeOperation = typeOperation;
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
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
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
