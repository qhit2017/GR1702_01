public class Eight {
	public static void main(String[] args) {
		System.out.println("µÚ°ËÌâ:");
		int sum = 0;
		for (int a = 100; a < 1000; a++) {
			if (a % 3 == 0 && a % 10 == 6) {
				sum = sum + 1;
			}
		}
		System.out.println(sum);
	}
}
