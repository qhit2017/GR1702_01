package com.zk.qhit;

import java.util.Scanner;

//�Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳�����������
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
		int f;
		if (a > b) {
			f = a;
			a = b;
			b = f;
		}
		if (a > c) {
			f = a;
			a = c;
			c = f;
		}
		if (a > d) {
			f = a;
			a = d;
			d = f;
		}
		if (b > c) {
			f = b;
			b = c;
			c = f;
		}
		if (b > d) {
			f = b;
			b = d;
			d = f;
		}
		if (c > d) {
			f = c;
			c = d;
			d = f;
		}
		System.out.print("�Ӵ�С������˳���ǣ�" + d + "\t" + c + "\t" + b + "\t" + a);
		sc.close();
	}
}
