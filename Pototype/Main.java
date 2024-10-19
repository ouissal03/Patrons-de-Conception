package Pototype;

public class Main {
	public static void main(String[] args) {
		Palette p=new Palette();
		Editeur ed =new Editeur(p);
		ed.dessiner();
		ed.afficherDessin();
	}
}
