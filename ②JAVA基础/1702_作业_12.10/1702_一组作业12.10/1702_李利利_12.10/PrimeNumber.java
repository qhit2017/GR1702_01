public class PrimeNumber {

	public static void main(String[] args) {
		int all = 0;
		boolean isPrime;
		for (int i = 101; i < 200; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					all++;
					break;

				}
				if (isPrime) {
					System.out.println("素数是:" + i);
				}
			}
			System.out.println("101-200之间有" + all + "个素数");

		}
	}
}
