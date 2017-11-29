package yangxueting;

public class Odd {
	public static void main(String[] args) {
		// 请找出1000以内奇数
		for (int h = 1; h <= 1000; h++) {
			if (h % 2 != 0) {
				System.out.println("1000以内奇数有：" + h);
			}
		}
	}
}
