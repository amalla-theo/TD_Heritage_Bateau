package fr.btsciel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Bateau bateau = new Bateau(3,1.5,"Plastique");
        Barque barque = new Barque(4,2,"Bois",2);
        Voilier voilier = new Voilier(12,4,"Kevlar",2,4);
        Bateau_moteur bateauMoteur = new Bateau_moteur(5,3,"Aluminium",2,34);
        Bateau_helice bateauHelice = new Bateau_helice(4,2,"Bois",1,50,1);

        ArrayList<Bateau> list = new ArrayList<>();
        list.add(bateau);
        list.add(barque);
        list.add(voilier);
        list.add(bateauMoteur);
        list.add(bateauHelice);







        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i).getClass().getSimpleName()){
                case "Bateau":
                    System.out.println(bateau.getLongueur() + " " + bateau.getLargeur() + " " + bateau.getCoque());
                    break;
                case "Barque":
                    System.out.println(barque.getLongueur() + " " + barque.getLargeur() + " " + barque.getCoque() + " " + barque.getNombreRames());
                    break;
                case "Voilier":
                    System.out.println(voilier.getLongueur() + " " + voilier.getLargeur() + " " + voilier.getCoque() + " " + voilier.getNombreMats() + " " + voilier.nombreVoiles);
                    break;
                case "Bateau_moteur":
                    System.out.println(bateauMoteur.getLongueur() + " " + bateauMoteur.getLargeur() + " " + bateauMoteur.getCoque() + " " + bateauMoteur.getNombreMoteurs() + " " + bateauMoteur.getPuissance());
                    break;
                case "Bateau_helice":
                    System.out.println(bateauHelice.getLongueur() + " " + bateauHelice.getLargeur() + " " + bateauHelice.getCoque() + " " + bateauHelice.getNombreMoteurs() + " " + bateauHelice.getPuissance() + " " + bateauHelice.getTirant_eau());
                    break;

            }
        }
    }
}