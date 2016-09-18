import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNum {
	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(100);
		String num = JOptionPane.showInputDialog("Guess what number I am thinking of");
		int n = Integer.parseInt(num);
		if(n == x){
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		while(n != x){
			JOptionPane.showMessageDialog(null, "Incorrect.");
			if(n < x){
				JOptionPane.showMessageDialog(null, "Higher");
			}
			if(n > x){
				JOptionPane.showMessageDialog(null, "Lower");
			}
			num = JOptionPane.showInputDialog("Guess what number I am thinking of");
			n = Integer.parseInt(num);
			if(n == x){
				JOptionPane.showMessageDialog(null, "Correct!");
			}
		}
	}
}
