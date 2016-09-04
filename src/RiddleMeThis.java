import javax.swing.JOptionPane;

public class RiddleMeThis {
	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		if(answer.equalsIgnoreCase("nothing")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score =+ 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 'Nothing'");
		}
		String answer2 = JOptionPane.showInputDialog("Who makes it, has no need of it.Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		if(answer2.equalsIgnoreCase("a coffin")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score =+ 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 'A Coffin'");
		}
		String answer3 = JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		if(answer3.equalsIgnoreCase("man")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score =+ 1;
		}
		else{
			JOptionPane.showInputDialog("Wrong, the answer is 'Man'");
		}
		String answer4 = JOptionPane.showInputDialog("What gets broken without being held?");
		if(answer4.equalsIgnoreCase("a promise")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score =+ 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 'A Promise'");
		}

		JOptionPane.showMessageDialog(null, "Your score is" + score);
	}

}
