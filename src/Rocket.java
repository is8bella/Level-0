import javax.swing.JOptionPane;
import java.io.IOException;

public class Rocket {
	public static void main(String[] args) {
		for(int i = 10; i > 0; i --){
			System.out.println(i);
		}
		
		speak("Blast Off");
		
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

	}


