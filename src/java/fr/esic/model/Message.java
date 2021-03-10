
package fr.esic.model;

import java.sql.Date;


public class Message {
    private int idMessage;
    private String contenuMessage;
    private Date dateMessage; 
    private Person person;

    public Message() {
    }

    public Message(String contenuMessage, Date dateMessage, Person person) {
        this.contenuMessage = contenuMessage;
        this.dateMessage = dateMessage;
        this.person = person;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getContenuMessage() {
        return contenuMessage;
    }

    public void setContenuMessage(String contenuMessage) {
        this.contenuMessage = contenuMessage;
    }

    public Date getDate_message() {
        return dateMessage;
    }

    public void setDate_message(Date dateMessage) {
        this.dateMessage = dateMessage;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    
}
