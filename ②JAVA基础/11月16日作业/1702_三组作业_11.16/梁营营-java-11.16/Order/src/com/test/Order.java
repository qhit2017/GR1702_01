package com.test;

import java.util.Scanner;

//��ҵ����
//���ߣ���ӪӪ��
public class Order {
	public static void main(String[] args) {
		// �Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳�����������
		System.out.println("�������ֵ�ǣ�");
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		System.out.println("����ĵ�һ�����ǣ�" + a);
		int b = number.nextInt();
		System.out.println("����ĵڶ������ǣ�" + b);
		int c = number.nextInt();
		System.out.println("����ĵ��������ǣ�" + c);
		int d = number.nextInt();
		System.out.println("����ĵ��ĸ����ǣ�" + d);

		// ������
		int i;
		if (a < b) {
			i = a;
			a = b;
			b = i;

		}

		if (a < c) {
			i = a;
			a = c;
			c = i;

		}
		if (a < d) {
			i = a;
			a = d;
			d = i;

		}

		if (b < c) {
			i = b;
			b = c;
			c = i;

		}
		
		if (b < d) {
			i = b;
			b = d;
			d = i;
		}

		if (c < d) {
			i = c;
			c = d;
			d = i;

		}

		

		System.out.println("a��b��c��d��˳������Ϊ��"+a +"\t"+">"+ "\t" + b + "\t" +">"+ "\t"+ c + "\t"+">"+ "\t" + d);
	}
}
