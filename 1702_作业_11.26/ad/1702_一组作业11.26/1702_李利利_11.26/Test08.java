public class Test08 {
	public static void main(String[] args) {
		for (int a = 1; a <= 10000; a++) {
			if (a % 3 == 0 && a % 10 == 6) {
				System.out.println(a);
			}
		}
	}

}
