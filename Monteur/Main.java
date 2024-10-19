package Monteur;

public class Main {
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		Monteur_presentation ppt = new Projet_presentation();
		etu.set_monteur_presentation(ppt);
		etu.construire_presentation();
		
	}
}
