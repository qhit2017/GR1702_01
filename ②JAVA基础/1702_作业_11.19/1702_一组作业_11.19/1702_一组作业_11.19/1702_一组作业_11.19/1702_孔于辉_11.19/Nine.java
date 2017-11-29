package com;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的整数");
		int s = sc.nextInt();

		for (int a = 1; a <= s; a++) {

			if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 % 10 == 7
					|| a % 10 == 7) {

				System.out.println("不大于输入的数里所有7的倍数和包含7的数字有" + a);

			}
		}
		sc.close();
	}
}
