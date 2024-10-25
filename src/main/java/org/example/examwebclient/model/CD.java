package org.example.examwebclient.model;


public class CD {

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




}