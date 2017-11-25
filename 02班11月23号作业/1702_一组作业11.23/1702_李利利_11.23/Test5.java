public class Test5 {

	public static void main(String[] args) {
		// 方法一
		int sum = 0;
		for (int x = 1; x <= 100; x++) {

			if (x % 2 != 0) {
				sum = sum + x;

			}
		}
		System.out.println("奇数和是:" + sum);

		// 方法二
		int s = 0;
		int f = 1;
		while (f <= 100) {
			if (f % 2 != 0) {
				s = s + f;
			}
			f++;
		}
		System.out.println("奇数和是:" + sum);
	}

}
