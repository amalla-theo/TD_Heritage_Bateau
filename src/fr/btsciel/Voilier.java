package fr.btsciel;

import java.util.ArrayList;

public class Voilier extends Bateau {
    protected int nombreMats;
    protected int nombreVoiles;

    public int getNombreMats() {
        return nombreMats;
    }

    public void setNombreMats(int nombreMats) {
        this.nombreMats = nombreMats;
    }

    public Voilier(double longueur, double largeur, String coque, int nombreMats, int nombreVoiles) {
        super(longueur, largeur, coque);
        this.nombreMats = nombreMats;
        this.nombreVoiles = nombreVoiles;
    }
}
