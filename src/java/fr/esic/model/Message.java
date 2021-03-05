
package fr.esic.model;

import java.sql.Date;


public class Message {
    private int id;
    private String contenu;
    private Date date_message; 
    private Person person;

    public Message() {
    }

    public Message(String contenu, Date date_message, Person person) {
        this.contenu = contenu;
        this.date_message = date_message;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate_message() {
        return date_message;
    }

    public void setDate_message(Date date_message) {
        this.date_message = date_message;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
    
    
}

