package com.zk.qhit;

import java.util.Scanner;

public class Judge {
	public static void main(String[] args) {
		/**
		 * ͨ������̨�������������ж��������Ĵ�С
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		double a = sc.nextDouble();
		System.out.println("�����������");
		double b = sc.nextDouble();

		if (a > b) {
			boolean c = true;
			System.out.println("a>b���жϽ��Ϊ��" + c);
		} else {
			boolean d = false;
			System.out.println("a>b���жϽ��Ϊ��" + d);
		}
		sc.close();
	}
}
