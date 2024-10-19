package Monteur;

public abstract class Monteur_presentation {
	Presentation ma_presentation;
	
	public Presentation get_presentation() {
		return ma_presentation;
	}
	public void nouvelle_presentation() {
		Presentation ma_presentation = new Presentation();
	}
	
	public abstract void monter_introduction();
	public abstract void monter_corps();
	public abstract void monter_conclusion();

}
