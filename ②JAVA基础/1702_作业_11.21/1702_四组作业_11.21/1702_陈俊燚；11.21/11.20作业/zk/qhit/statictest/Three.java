package com.zk.qhit.statictest;

import java.util.Scanner;

//������������x,y,z���������������С�������
public class Three {
	public static void main(String[] args) {
		System.out.println("������");
		int x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1������");
		x = sc.nextInt();
		System.out.println("�������2������");
		y = sc.nextInt();
		System.out.println("�������3������");
		z = sc.nextInt();
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x > z) {
			int t = x;
			x = z;
			z = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		System.out.println("����������С���������Ϊ��" + x + "<" + y + "<" + z);

	}
}