package Pototype;

import java.util.Scanner;

public class Editeur {
    Palette pal;
    Dessin dessin;

    public Editeur(Palette p) {
        super();
        this.pal = p;
        dessin = new Dessin();
    }

    public void afficherDessin() {
        dessin.affichage();
    }

    public void dessiner() {
        int aCercle;
        int aTriangle;
        int aRectangle;
        Cercle cercle = new Cercle("blue");
        Triangle triangle = new Triangle(null);
        Rectangle rectangle = new Rectangle(null);
        Scanner in = new Scanner(System.in);

        System.out.println("Ajouter Cercle (0/1) ? ");
        aCercle = in.nextInt();
        if (aCercle == 1) {
            pal.ajouter(cercle.clone());
        }
        System.out.println("Ajouter Triangle (0/1) ? ");
        aTriangle = in.nextInt();
        if (aTriangle == 1) {
            pal.ajouter(triangle.clone());
        }
        System.out.println("Ajouter Rectangle (0/1) ? ");
        aRectangle = in.nextInt();
        if (aRectangle == 1) {
            pal.ajouter(rectangle.clone());
        }
        pal.affichage();
        dessin.ajouterPalette(pal);
        dessin.affichage();
    }

    public void setPalette(Palette p) {
        this.pal = p;
    }
}
