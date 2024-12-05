package fr.btsciel;

import java.util.ArrayList;

public class Bateau_helice extends Bateau_moteur{
    protected int tirant_eau;

    public int getTirant_eau() {
        return tirant_eau;
    }

    public void setTirant_eau(int tirant_eau) {
        this.tirant_eau = tirant_eau;
    }

    public Bateau_helice(double longueur, double largeur, String coque, int nombreMoteurs, int puissance, int tirant_eau) {
        super(longueur, largeur, coque, nombreMoteurs, puissance);
        this.tirant_eau = tirant_eau;
    }
}

