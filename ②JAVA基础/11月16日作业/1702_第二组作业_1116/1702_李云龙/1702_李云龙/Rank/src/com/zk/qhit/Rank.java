package com.zk.qhit;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = sc.nextInt();
		System.out.println("������ڶ�����");
		int b = sc.nextInt();
		System.out.println("�������������");
		int c = sc.nextInt();
		System.out.println("��������ĸ���");
		int d = sc.nextInt();
		int i;
		if (a > b) {
			i = a;
			a = b;
			b = i;
		}
		if (a > c) {
			i = a;
			a = c;
			c = i;
		}
		if (a > d) {
			i = a;
			a = d;
			d = i;
		}
		if (b > c) {
			i = b;
			b = d;
			d = i;
		}
		if (c > d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println("�Ӵ�С��˳����:" + d + "\t" + c + "\t" + b + "\t" + a);
sc.close();
	}
}
