public class FiveWhile {
	// while方法计算1~100之间奇数的和
	public static void main(String[] args) {
		int sum = 0;
		int a = 1;
		while (a <= 100) {
			if (a % 2 != 0) {
				sum += a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
