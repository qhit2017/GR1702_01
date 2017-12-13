package com.test;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入四个整数");
		int a = sc.nextInt();
		System.out.println("第一个数是:" + a);

		int b = sc.nextInt();
		System.out.println("第二个数是:" + b);

		int c = sc.nextInt();
		System.out.println("第三个数是:" + c);

		int d = sc.nextInt();
		System.out.println("第四个数是:" + d);

		int temp = 0;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a < c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (a < d) {
			temp = a;
			a = d;
			d = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (b < d) {
			temp = b;
			b = d;
			d = temp;
		}
		if (c < d) {
			temp = c;
			c = d;
			d = temp;
		}
		if (d < a) {
			temp = d;
			d = a;
			a = temp;
		}
		System.out.println("由小到大的顺序输出是:" + a + "<" +c + "<" + b + "<" + d);

	}
 
}
