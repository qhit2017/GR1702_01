package com.kyh.qhit;

import java.util.Scanner;

/**
 * @author ���� E-mail:1299394372@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:23:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Rank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������");
		int a = sc.nextInt();

		System.out.println("������ڶ�������");
		int b = sc.nextInt();

		System.out.println("���������������");
		int c = sc.nextInt();

		System.out.println("��������ĸ�����");
		int d = sc.nextInt();

		int j;
		if (a < b) {
			j = a;
			a = b;
			b = j;
		}

		int w;
		if (b < c) {
			w = b;
			b = c;
			c = w;
		}

		int x;
		if (c < d) {
			x = c;
			c = d;
			d = x;
		}

		int h;
		if (a < d) {
			h = a;
			a = d;
			d = h;
		}

		int s;
		if (a < c) {
			s = a;
			a = c;
			c = s;
		}

		int g;
		if (b < d) {
			g = b;
			b = d;
			d = g;
		}

		if (a < b) {
			j = a;
			a = b;
			b = j;
		}

		if (b < c) {
			w = b;
			b = c;
			c = w;
		}

		if (c < d) {
			x = c;
			c = d;
			d = x;
		}

		if (a < d) {
			h = a;
			a = d;
			d = h;
		}

		if (a < c) {
			s = a;
			a = c;
			c = s;
		}

		if (b < d) {
			g = b;
			b = d;
			d = g;
		}

		System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
		sc.close();
	}

}
