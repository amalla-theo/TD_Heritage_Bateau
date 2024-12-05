package fr.btsciel;

import java.util.ArrayList;

public class Bateau {
    protected double longueur;
    protected double largeur;
    protected String coque;

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public String getCoque() {
        return coque;
    }

    public void setCoque(String coque) {
        this.coque = coque;
    }

    public Bateau(double longueur, double largeur, String coque) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.coque = coque;
    }


}

