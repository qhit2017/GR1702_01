package com.zk.qhit;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		/**
		 * ������N(N<=10000),�������7�ı����Ͱ���7������
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���һ��������10000����!");
		long a = sc.nextLong();
		if (a > 10000) {
			System.out.println("���ֲ��ܴ���10000");
		} else {
			for (int i = 1; i < 1; i++) {
				if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7
						|| i / 100 == 7 || i / 1000 == 7) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}
