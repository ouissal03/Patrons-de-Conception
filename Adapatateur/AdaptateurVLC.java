package Adapatateur;

public class AdaptateurVLC extends MediaPlayer{
	 VLC monVLC = new VLC();
	 
	 public void afficherImage() {
		 monVLC.image();
	 }
	 public void emettreAudio() {
		 monVLC.audio();
	 }

}
