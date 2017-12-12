public class Three {
	public static void main(String[] args) {
		boolean isPrime;
		for (int i = 101; i <= 200; i++) {
			isPrime = false;
			for (int j = 2; j < i; j++) {
				if (0 == i % j) {
					isPrime = true;
					break;
				}
			}
			if (!isPrime) {
				System.out.println("100到200间的素数:"+i);
			}
		}
	}
}
