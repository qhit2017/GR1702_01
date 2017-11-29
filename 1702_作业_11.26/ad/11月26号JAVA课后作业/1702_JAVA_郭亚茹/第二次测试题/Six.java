package Guo;

public class Six {
	public static void main(String[] args) {
		// 求1000以内8的倍数的数字共有多少个，请输出
		int sum = 0;
		for (int i = 8; i < 1000; i++) {
			if (i % 8 == 0) {
				sum++;

			}
		}
		System.out.println(sum);
	}

}
