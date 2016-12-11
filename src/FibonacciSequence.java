
public class FibonacciSequence {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 100; i++) {
			Integer c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
