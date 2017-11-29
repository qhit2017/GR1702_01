package com.zk.qhit;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		/**
		 * 键盘输N(N<=10000),输出所有7的倍数和包含7的数字
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("输出一个不大于10000的数!");
		long a = sc.nextLong();
		if (a > 10000) {
			System.out.println("数字不能大于10000");
		} else {
			for (int i = 1; i < 1; i++) {
				if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7
						|| i / 100 == 7 || i / 1000 == 7) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}
