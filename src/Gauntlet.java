import javax.swing.plaf.synth.SynthSeparatorUI;

public class Gauntlet {
	public static void main(String[] args) {
		for (int i = 13; i >= 0; i--) {
			int year = 2003 + i;
			System.out.println("In " + year + ", I was " + i + " years old.");
		}
	}
}
