package Guo;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// 输入一个整数N(0<N<=1000),当N为奇数时，输出1到N之间的奇数和，
		// 当N为偶数时，输出1到N之间的偶数和。
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于1000的整数：");
		int N = sc.nextInt();
		int sum = 0;
		if (N % 2 == 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}

			}

		} else {
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0) {
					sum = sum + i;
				}
			}
		}
		System.out.println(sum);
		
	}
}
