package fr.btsciel;

import java.util.ArrayList;

public class Barque extends Bateau {
    protected int nombreRames;

    public int getNombreRames() {
        return nombreRames;
    }

    public void setNombreRames(int nombreRames) {
        this.nombreRames = nombreRames;
    }

    public Barque(double longueur, double largeur, String coque, int nombreRames) {
        super(longueur, largeur, coque);
        this.nombreRames = nombreRames;
    }
}
