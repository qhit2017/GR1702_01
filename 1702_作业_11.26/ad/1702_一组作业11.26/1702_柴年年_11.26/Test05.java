package com.qhit;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:33:17
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ����");
		int a = sc.nextInt();
		System.out.println("����ڶ�����");
		int b = sc.nextInt();
		System.out.println("�����������");
		int c = sc.nextInt();
		int d = 0;
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		if (a > c) {
			d = a;
			a = c;
			c = d;
		}
		if (b > c) {
			d = b;
			b = c;
			c = d;
		}
		if (c > a) {
			d = c;
			c = a;
			a = d;
		}
		System.out.println(c + "<" + b + "<" + a);
	}
}