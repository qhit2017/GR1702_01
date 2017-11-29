public class Sumwhile {
	public static void main(String[] args) {
		System.out.println("第五题:");
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			if (a % 2 == 1) {
				sum += a;
			}
			a++;
		}
		System.out.println("1~100之间奇数的和:" + sum);
	}
}
