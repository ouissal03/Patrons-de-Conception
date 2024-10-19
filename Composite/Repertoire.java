package Composite;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Noeud{
	String nom;
	int total;
	private List<Noeud> elements = new ArrayList<>();
	
	public Repertoire(String nom) {
        this.nom = nom;
    }
	@Override
    public void ajouter(Noeud n) {
		elements.add(n);
	}
	@Override
	public void supprimer(Noeud n) {
		elements.remove(n);
	}
	
	public int taille() {
		 int total = 0;
	        for (Noeud element : elements) {
	            total += element.taille();
	        }
	        return total;
	}
	public void afficher() {
		total=taille();
        System.out.println("Repertoire : "+nom+ "| taille :" +total);
        for (Noeud element : elements) {
            element.afficher();
        }       
    }
}
