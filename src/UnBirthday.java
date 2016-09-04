import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Is it your birthday?");
		if (answer.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Happy Un-Birthday!");
		}
		
	}
	
	

}
