package org.example.ejbbackendexam.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class CD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nom;
    private double prix;
    private boolean ifEmprunte;

    public CD(String id, String nom, double prix,boolean ifEmprunte) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.ifEmprunte = ifEmprunte;
    }

    public CD() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
  public boolean getifEmprunte() {
        return ifEmprunte;
    }

    public void setIfEmprunte(boolean b) {
        this.ifEmprunte = b;
    }
}