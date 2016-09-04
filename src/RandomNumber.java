import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random r = new Random ();
		int x = r.nextInt(3);
		int y = r.nextInt(3);
		int z = r.nextInt(3);
		System.out.println(x);
		if(x == y && x == z){
			JOptionPane.showMessageDialog(null, "You won.");
			
		}
	}

}
