package Singleton;

public class Administrateur {
	protected String nom ;
	protected String prénom;
	protected static Administrateur instance;
	protected Administrateur(String nom,String prénom) {
		this.nom=nom;
		this.prénom=prénom;
	}
	public static Administrateur getInstance(){
		if(instance==null)
			 instance = new Administrateur("darkaoui","mohamed");
		return instance;
	}

}
