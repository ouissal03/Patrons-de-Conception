package Fabrique;

public class DeveloppeurCreatoeur extends InformaticienCreatoeur {
	
	public Spécialité créerSpécialité() {
		return new Developpement();
	}

}
