package Singleton;

public class Main {
	public static void main(String[] args) {
		Administrateur a1 = Administrateur.getInstance();
		Administrateur a2 = Administrateur.getInstance();
		System.out.println(a1);
		System.out.println(a2);
	}
}
