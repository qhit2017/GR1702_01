package com;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int s = sc.nextInt();

		for (int a = 1; a <= s; a++) {

			if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 % 10 == 7
					|| a % 10 == 7) {

				System.out.println("�������������������7�ı����Ͱ���7��������" + a);

			}
		}
		sc.close();
	}
}
