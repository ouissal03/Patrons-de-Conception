package Pototype;

public class Triangle extends Forme{

	 public Triangle(String s) {
	        super(s);
	    }
	    @Override
	    public void dessiner() {
	        System.out.println("Dessin d'un triangle avec la couleur " + couleur);
	    }
	    
	    public String toString() {
	        return ("Triangle");
	    }
	    
	    
	    public Forme clone() {
	        return new Triangle(couleur);
	    }
	    
	    @Override
	    public void afficher() {
	        System.out.println("Triangle " + couleur);
	    }

}
