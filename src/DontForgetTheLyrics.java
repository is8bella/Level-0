import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "Guess the next lyrics of the song");
		// 5. Use the playSound method to play your song.
		playSound("gotit");
		// 6. Make a pop-up for the player to type their answer.
		String answer = JOptionPane.showInputDialog("What's the next line?");
		// 7. If they answered correctly, tell them that they were right.
		if(answer.equals("thing")){
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else{
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was 'thing' ('I got this thing')");
		}
		// 9. Record another sound and repeat steps 5-8.
		
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


