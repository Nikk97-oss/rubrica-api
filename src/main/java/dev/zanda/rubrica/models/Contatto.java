package dev.zanda.rubrica.models;

import jakarta.persistence.*;

@Entity
@Table(name="contatto")
public class Contatto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contactID")
    private int contactId;

    @Column(name="firstname")
    private String nome;

    @Column(name="lastname")
    private String cognome;

    private String email;

    @Column(name="ntel")
    private String nTel;


    public Contatto(){}

    public Contatto(String nome, String cognome, String email, String nTel) {

        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.nTel = nTel;
    }

    public int getContact_id() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNTel() {
        return nTel;
    }

    public void setNTel(String nTel) {
        this.nTel = nTel;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "contactId=" + contactId +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", nTel='" + nTel + '\'' +
                '}';
    }
}
