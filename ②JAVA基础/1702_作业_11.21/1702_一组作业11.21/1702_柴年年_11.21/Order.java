package com.zk.qhit.statictest;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����7:46:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ����");
		int a = sc.nextInt();
		System.out.println("����ڶ�����");
		int b = sc.nextInt();
		System.out.println("�����������");
		int c = sc.nextInt();
		int d = 0;
		if (a < b) {
			d = a;
			a = b;
			b = d;
		}
		if (a < c) {
			d = a;
			a = c;
			c = d;
		}
		if (b < c) {
			d = b;
			b = c;
			c = d;
		}
		if (c < a) {
			d = c;
			c = a;
			a = d;
		}
		System.out.println(a + "<" + b + "<" + c);
	}
}
