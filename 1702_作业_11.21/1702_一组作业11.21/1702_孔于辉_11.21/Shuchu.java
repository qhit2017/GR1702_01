package com.tsinghua;

import java.util.Scanner;

public class Shuchu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
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
