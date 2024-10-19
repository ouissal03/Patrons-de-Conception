package Composite;

public class Main {
	public static void main(String[] args) {
		Noeud racine = new Repertoire("LP GLAASRI");
		Noeud n1 = new Repertoire("exams");
		Noeud n2 =new Fichier("EXAM1.pdf",120);
		Noeud n3 = new Fichier("Presentation.ppt",50);
		racine.ajouter(n1);
		n1.ajouter(n2);
		racine.ajouter(n3);
		int t1=n2.taille();
		int t2=racine.taille();
		n2.afficher();
		racine.afficher();
	}

}
