package com.qhit.animal;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:15:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Size {

	public static void main(String[] args) {
		// �Ӽ�������4��������
		// ��д����ʵ�ֶ���4 �������Ӵ�С��˳���������
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ��ֵ");
		int a = sc.nextInt();
		System.out.println("����ڶ���ֵ");
		int b = sc.nextInt();
		System.out.println("���������ֵ");
		int c = sc.nextInt();
		System.out.println("������ĸ�ֵ");
		int d = sc.nextInt();
		int i = 0;
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
			b = c;
			c = i;
		}
		if (b > d) {
			i = b;
			b = d;
			d = i;
		}
		if (c > d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println(d + ">" + c + ">" + b + ">" + a);
	}
}
