import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String yes = "yes";
	String answertwo = "no";
	String answerone = JOptionPane.showInputDialog("Are you happy?");
	if(answerone.equals(yes)){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else{
		answertwo = JOptionPane.showInputDialog("Do you want to be happy?");
	}
	if(answertwo.equals (yes)){
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
}
}
