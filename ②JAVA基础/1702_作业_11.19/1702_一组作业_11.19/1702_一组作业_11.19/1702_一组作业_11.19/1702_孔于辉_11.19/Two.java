package com;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();

		if (a < b) {
			System.out.println(a + "С��" + b);
		} else if (a > b) {
			System.out.println(a + "����" + b);
		} else {
			System.out.println(a + "����" + b);
		}
		sc.close();
	}

}
