import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		int c = 0;
		Random r = new Random();
		int mynumber = 99;
		for (int i = 0; i <= 1000000; i++) {
			int y = r.nextInt(100);
			if (mynumber == y) {
				c++;
			}
		}
		System.out.println(c);
		c = 0;
		for (int i = 0; i <= 1000000; i++) {
			int num = r.nextInt(100);
			int lnum = r.nextInt(100);
			if (num == lnum) {
				c++;
			}
	}
		System.out.println(c);
	}

}
