package Com.qhit;

import java.util.Scanner;

public class zuoye9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		if (N <= 0 || N > 1000) {
			System.out.println("输入错误");
		} else if (N % 2 == 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("偶数和为：" + sum);
		} else if (N % 2 != 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
			System.out.println("奇数和为" + sum);
		}

		sc.close();
	}
}
