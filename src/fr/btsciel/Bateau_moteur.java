package fr.btsciel;

import java.util.ArrayList;

public class Bateau_moteur extends Bateau {
    protected int nombreMoteurs;
    protected int puissance;

    public int getNombreMoteurs() {
        return nombreMoteurs;
    }

    public void setNombreMoteurs(int nombreMoteurs) {
        this.nombreMoteurs = nombreMoteurs;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public Bateau_moteur(double longueur, double largeur, String coque, int nombreMoteurs, int puissance) {
        super(longueur, largeur, coque);
        this.nombreMoteurs = nombreMoteurs;
        this.puissance = puissance;
    }
}
