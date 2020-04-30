package echec_javafx;

import java.net.URISyntaxException;
import java.net.URL;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class MusiqueJeu {

	private MediaPlayer player;

	public MusiqueJeu() throws URISyntaxException {
		URL urlMusic = jeuEchec.class.getResource("/Son/Electro-blues-groovy-lounge-track.mp3");
		Media music = new Media(urlMusic.toURI().toString());
		player = new MediaPlayer(music);
		//player.autoPlayProperty();
		//player.setCycleCount(M);
		player.setStartTime(Duration.ZERO);
		player.setStopTime(Duration.INDEFINITE);
		player.play();
	}
	
	public MediaPlayer getPlayer() {
		return player;
	}

	public void setPlayer(MediaPlayer player) {
		this.player = player;
	}

	public void fermerMusic() {
		
		player.setMute(true);

	}
	public void OuvrirMusic() {
		
		player.setMute(false);

	}

}
