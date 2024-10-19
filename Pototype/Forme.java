package Pototype;

public abstract class Forme implements Cloneable{
	public String couleur;
	
	public void setCouleur(String s) {
		this.couleur=s;
	}
	public String getCouleur() {
		return couleur;
	}
	public Forme(String s) {
		super();
		this.couleur = s;
	}
	public abstract Forme clone();
	
	public void dessiner() {
		
	}
	public void afficher() {
		
	}

}
