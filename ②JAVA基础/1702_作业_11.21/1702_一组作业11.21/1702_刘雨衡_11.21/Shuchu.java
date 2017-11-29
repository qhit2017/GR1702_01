package com.tsinghua;

import java.util.Scanner;

public class Shuchu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数：");
		int c = sc.nextInt();

		int g = 0;
		if (a < b) {
			g = a;
			a = b;
			b = g;
		}
		if (a < c) {
			g = a;
			a = c;
			c = g;
		}
		if (b < c) {
			g = b;
			b = c;
			c = g;
		}
		if (c < a) {
			g = c;
			c = a;
			a = g;
		}
		System.out.println(a + "<" + b + "<" + c);

		sc.close();
	}

}
