package com;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		if (i > 10000 && i <= 99999) {
			int w = (int) (i / 10000);
			int k = (int) ((i % 10000)/1000);
			int s = (int) (i / 10 % 10);
			int g = (int) (i % 10);
			if (w == g && k == s) {
				System.out.println("i是回文数");
			} else {
				System.out.println("i不是回文数");
			}

		} else {
			System.out.println("请输入一个五位数");
		}
		sc.close();
	}
}
