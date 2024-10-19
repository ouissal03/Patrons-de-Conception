package Decorateur;

public class Main {
	public static void main(String[] args) {
		Composant c1 = new Chambre("Salon");
		c1.dessiner();
		Composant c2 = new CanapéDecoration(c1);
		c2.dessiner();
		Composant c3 = new TableDecorateur(new CanapéDecoration(new Chambre("cuisine")));
				
	}
}
