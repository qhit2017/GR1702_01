package com.kyh;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������1000������:");
		int b = sc.nextInt();
		int sum = 0;
		int summ = 0;

		if (b % 2 == 0) {
			for (int a = 1; a <= b; a++) {
				if (a % 2 == 0) {
					sum += a;
				}
			}
			System.out.println("ż����Ϊ��" + sum);
		}

		if (b % 2 != 0) {
			for (int d = 1; d <= b; d++) {
				if (d % 2 == 0) {
					sum += d;
				}
			}
			System.out.println("������Ϊ��" + summ);
		}

	}

}
