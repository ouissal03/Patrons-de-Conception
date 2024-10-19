package Pototype;

import java.util.ArrayList;
import java.util.List;

public class Palette {
    List<Forme> pal = new ArrayList<Forme>();

    public Palette() {
        super();
    }

    public Forme getForme(int rang) {
        return pal.get(rang);
    }
    public int getTaille() {
        return pal.size();
    }

    public void ajouter(Forme f) {
        pal.add(f);
    }

    public void affichage() {
        System.out.println("Palette:");
        for (int i = 0; i < pal.size(); i++) {
            System.out.println((i + 1) + "." + pal.get(i).toString());
        }
        
    }
}
