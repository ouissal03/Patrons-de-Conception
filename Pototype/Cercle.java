package Pototype;

public class Cercle extends Forme{

	public Cercle(String s) {
        super(s);
    }
    
    @Override
    public void dessiner() {
        System.out.println("Dessin d'un cercle avec la couleur " + couleur);
    }
    
    public String toString() {
        return ("Cercle");
    }
    
    
    public Forme clone() {
        return new Cercle(couleur);
    }

    @Override
    public void afficher() {
        System.out.println("Cercle " + couleur);
    }

}
