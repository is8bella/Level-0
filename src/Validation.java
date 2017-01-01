import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
				for (int i = 0; i < 16; i++) {
					int randomNumber = new Random().nextInt(8);
					if(randomNumber == 0){
						JOptionPane.showMessageDialog(null, "You've really nailed being a human being. Good job.");
					}
					else if(randomNumber == 1){
						JOptionPane.showMessageDialog(null, "People talk about how nice you are behind your back.");
					}
					else if(randomNumber == 2){
						JOptionPane.showMessageDialog(null, "You're better than free wifi.");
					}
					else if(randomNumber == 3){
						JOptionPane.showMessageDialog(null, "8 out of 10 cats like you.");
					}
					else if(randomNumber == 4){
						JOptionPane.showMessageDialog(null, "The FBI tapped your phone just to hear the sound of your voice.");
					}
					else if(randomNumber == 5){
						JOptionPane.showMessageDialog(null, "If you were a cupcake, I'd definitely eat you. And then I'd feel really guilty, knowing that I ate the best cupcake in the world.");
					}
					else if(randomNumber == 6){
						JOptionPane.showMessageDialog(null, "If you look up 'beautiful' in the dictionary, there will be an accurate description of you. Because the dictionary is not a picture book. (Don't be stupid.)");
					}
					else if(randomNumber == 7){
						JOptionPane.showMessageDialog(null, "When someone calls you ugly, you should say 'Go fish.' Because if they're going to say something stupid, then you should, too.");
					}
					
				}
		}
}


