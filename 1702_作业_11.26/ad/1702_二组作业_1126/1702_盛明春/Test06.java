package shape01;

public class Test06 {
	public static void main(String[] args) {
		int b = 0;
		for (int a = 0; a < 1000; a++) {
			if (a % 8 == 0) {
				b++;
			}
		}
		System.out.println(b);
	}
}
