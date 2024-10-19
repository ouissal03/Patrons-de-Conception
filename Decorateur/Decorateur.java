package Decorateur;

public abstract class  Decorateur extends Composant{
	Composant monComposant;
	
	public Decorateur(Composant monComposant) {
		this.monComposant=monComposant;
	}
	public void dessiner() {
		
	}
}
