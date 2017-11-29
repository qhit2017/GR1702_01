package com.zk.qhit;

import java.util.Scanner;

public class Estimate {
	public static void main(String[] args) {
		/**
		 * 通过键盘输入一个数，判断该数是正数还是负数
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("该数为正数" + a);
		} else if (a > 0) {
			System.out.println("该数为负数" + a);
			System.out.println("该数既不是正数也不是负数");
		}
		sc.close();
	}
}
