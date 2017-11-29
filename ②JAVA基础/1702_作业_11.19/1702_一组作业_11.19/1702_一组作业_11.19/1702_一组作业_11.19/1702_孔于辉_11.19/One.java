package com;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");

		int a = sc.nextInt();
		if (a < 0) {
			System.out.println(a + "是负数！");
		}

		else {
			System.out.println(a + "是正数");
		}
		sc.close();
	}

}
