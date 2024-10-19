package Composite;

public class Fichier extends Noeud{
	int taille;
	private String nom;

    public Fichier(String nom,int taille) {
        this.nom = nom;
        this.taille=taille;
    }

    public void afficher() {
        System.out.println(nom);
    }
    
	@Override
	public int taille() {
		return this.taille;
	}


}
