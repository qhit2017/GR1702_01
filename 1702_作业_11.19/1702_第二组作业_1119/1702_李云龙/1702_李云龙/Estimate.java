package com.zk.qhit;

import java.util.Scanner;

public class Estimate {
	public static void main(String[] args) {
		/**
		 * ͨ����������һ�������жϸ������������Ǹ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("����Ϊ����" + a);
		} else if (a > 0) {
			System.out.println("����Ϊ����" + a);
			System.out.println("�����Ȳ�������Ҳ���Ǹ���");
		}
		sc.close();
	}
}
