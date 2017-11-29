public class Four {
	public static void main(String[] args) {
		System.out.println("第四题:");
		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum = sum + a;
			}
		}
		System.out.println("1000以内所有8倍数之和:" + sum);
	}
}
