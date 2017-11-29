//用for 和 while两种方法计算1~100之间奇数的和
public class Fivefor {
	public static void main(String[] args) {
		System.out.println("第五题");
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}
}
