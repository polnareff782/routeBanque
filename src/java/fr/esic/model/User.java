package fr.esic.model;

public class User {

    private int idUtil;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String telephone;
    private String sexe;
    private String dateNaissance;
    private String mail;
    private String adresse;
    private int idPerson;
    private int idRole;

    public User() {
    }

    public User(String nom, String prenom, String telephone, String sexe, String dateNaissance, String mail, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.adresse = adresse;
    }

    public User(String nom, String prenom, String login, String password, String telephone, String sexe, String dateNaissance, String mail, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.adresse = adresse;
    }

    public User(String login, String password, int idPerson, int idRole) {
        this.login = login;
        this.password = password;
        this.idPerson = idPerson;
        this.idRole = idRole;
    }
     
    
    
    public User(int idUtil, String nom, String prenom, String login, String password, String telephone, String sexe, String dateNaissance, String mail, String adresse, int idPerson, int idRole) {
        this.idUtil = idUtil;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.adresse = adresse;
        this.idPerson = idPerson;
        this.idRole = idRole;
    }

    public User(int idUtil, String login, String password, int idPerson, int idRole) {
        this.idUtil = idUtil;
        this.login = login;
        this.password = password;
        this.idPerson = idPerson;
        this.idRole = idRole;
    }

    public int getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    
  
    

}
