package com.kyh;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");

		int b = sc.nextInt();
		;
		System.out.println("请输入第三个数");
		int c = sc.nextInt();
		;
		int j = 0;

		if (a > b) {
			j = a;
			a = b;
			b = j;
		}

		if (a > c) {
			j = a;
			a = c;
			c = j;
		}

		if (b > c) {
			j = b;
			b = c;
			c = j;
		}
		System.out.println(a + "<" + b + "<" + c);
		sc.close();
	}
}
