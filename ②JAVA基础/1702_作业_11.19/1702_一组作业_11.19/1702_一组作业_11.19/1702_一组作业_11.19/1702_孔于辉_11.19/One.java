package com;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�");

		int a = sc.nextInt();
		if (a < 0) {
			System.out.println(a + "�Ǹ�����");
		}

		else {
			System.out.println(a + "������");
		}
		sc.close();
	}

}
