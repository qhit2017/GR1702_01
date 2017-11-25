package qhit02;

public class jishu {
	public static void main(String[] args) {
		System.out.println("用while循环算1~100之间奇数的和");
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum = sum + a;
			a = a + 2;
		}
		System.out.println("1~100之间奇数的和为：" + sum);

		System.out.println("用for循环算1~100之间奇数的和");
		int he = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				he += i;
			}
		}
		System.out.println("1~100之间奇数的和为：" + he);

	}
}
