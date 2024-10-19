package Stratégie;

public class Image {
	 private Filtre filtre;

	    public Image(Filtre filtre) {
	        this.filtre = filtre;
	    }

	    public void appliquerFiltre(Image image) {
	        this.filtre.appliquer(image);
	    }

	    public void setFiltre(Filtre filtre) {
	        this.filtre = filtre;
	    }
	}

	






