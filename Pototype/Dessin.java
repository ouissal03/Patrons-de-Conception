package Pototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dessin {
    List<Forme> monDessin = new ArrayList<Forme>();

    public void ajouterPalette(Palette p) {
        for (int i = 0; i < p.getTaille(); i++) {
            monDessin.add(p.getForme(i).clone());
        }
    }

    public void affichage() {
        Scanner in = new Scanner(System.in);
        int choix;
        do {
            System.out.println("Palette:");
            for (int i = 0; i < monDessin.size(); i++) {
                System.out.println((i + 1) + "." + monDessin.get(i).toString());
            }
            System.out.print("Choisir une forme à dessiner:");
            choix = in.nextInt();
            if (choix > 0 && choix <= monDessin.size()) {
                Forme formeChoisie = monDessin.get(choix - 1);
                System.out.print("Couleur?");
                String couleur = in.next();
                formeChoisie.setCouleur(couleur);
                System.out.print("Dessin d'un " + formeChoisie.toString() + " avec la couleur " + couleur);
                formeChoisie.dessiner();
            }
            System.out.print("Voulez-vous ajouter une autre forme? (0/1)");
            choix = in.nextInt();
        } while (choix != 0);

        System.out.println("Votre dessin comprend :");
        for (int i = 0; i < monDessin.size(); i++) {
            Forme f = monDessin.get(i);
            System.out.print("- ");
            f.afficher();
            System.out.println(" de couleur " + f.getCouleur());
        }
    }
}
