package Fabrique;

public class Main {
	public static void main(String[] args) {
	InformaticienCreatoeur toto = new DeveloppeurCreatoeur();
	Spécialité s = toto.créerSpécialité();
    s.afficherInfo();
}
}
