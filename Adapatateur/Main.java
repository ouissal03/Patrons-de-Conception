package Adapatateur;

public class Main {
	public static void main(String[] args) {
		MediaPlayer m1 = new MP4();
		m1.afficherImage();
		m1.emettreAudio();
		MediaPlayer m2 = new AdaptateurVLC();
		m2.afficherImage();
		m2.emettreAudio();
	}
}
