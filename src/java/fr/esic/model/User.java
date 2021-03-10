package fr.esic.model;

public class User {
    private int id;
    private String login;
    private String mdp;
    private Person person;
    private Role role;
    private int statut;
    public User() {
    }

    
    public User(int id, String login, String mdp, Person person, Role role) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.person = person;
        this.role = role;
    }
    
    public User(String login, String mdp, Person person) {
        this.login = login;
        this.mdp = mdp;
        this.person = person;
    }

    public User(String login, String mdp, Person person, int statut) {
        this.login = login;
        this.mdp = mdp;
        this.person = person;
        this.statut = statut;
    }
    
    

    public User(int id, String login, String mdp, Person person, Role role, int statut) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.person = person;
        this.role = role;
        this.statut = statut;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    

}
