package com.zk.qhit;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		double a = sc.nextInt();
		System.out.println("����������");
		double b = sc.nextInt();
		double c = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		System.out.println("�����" + b + ">" + a);
		sc.close();
	}
}