public class Two {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1到99间奇数和为:" + sum);
	}
}
