package com.zk.qhit;

import java.util.Scanner;

public class Judge {
	public static void main(String[] args) {
		/**
		 * 通过控制台输入两个数，判断两个数的大小
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		double a = sc.nextDouble();
		System.out.println("请输入二个数");
		double b = sc.nextDouble();

		if (a > b) {
			boolean c = true;
			System.out.println("a>b的判断结果为：" + c);
		} else {
			boolean d = false;
			System.out.println("a>b的判断结果为：" + d);
		}
		sc.close();
	}
}
