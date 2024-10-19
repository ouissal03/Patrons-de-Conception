package Pototype;

public class Rectangle extends Forme{

	public Rectangle(String s) {
        super(s);
    }
    
    @Override
    public void dessiner() {
        System.out.println("Dessin d'un rectangle avec la couleur " + couleur);
    }
    
    public String toString() {
        return ("Rectangle");
    }
    
    
    public Forme clone() {
        return new Rectangle(couleur);
    }
    
    @Override
    public void afficher() {
        System.out.println("Rectangle " + couleur);
    }
}




