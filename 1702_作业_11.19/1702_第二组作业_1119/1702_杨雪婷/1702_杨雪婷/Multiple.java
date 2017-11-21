package yangxueting;

public class Multiple {
	public static void main(String[] args) {
		// 求1000以内所有8的倍数之和
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			if (j % 8 == 0) {
				sum = sum + j;
			}
		}

		System.out.println("1000以内所有8的倍数之和是：" + sum);
	}
}
