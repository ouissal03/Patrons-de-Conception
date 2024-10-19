package Monteur;

public class Etudiant {
	Monteur_presentation ppt;
	
	public Presentation get_presentation(){
		return ppt.ma_presentation;
	}
	
	public void set_monteur_presentation(Monteur_presentation ma_Pre) {
		this.ppt=ma_Pre;	
	}
	public void construire_presentation() {
		ppt.nouvelle_presentation();
		ppt.monter_introduction();
		ppt.monter_corps();
		ppt.monter_conclusion();
	}

}
