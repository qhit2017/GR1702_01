package com.zk.qhit;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年数");
		int a = sc.nextInt();
		System.out.println("请输入月数");
		int b = sc.nextInt();
		System.out.println("请输入日数");
		int c = sc.nextInt();
		int i = 0;
		switch (b) {
		case 12:
			i += 30;
		case 11:
			i += 31;
		case 10:
			i += 30;
		case 9:
			i += 31;
		case 8:
			i += 31;
		case 7:
			i += 30;
		case 6:
			i += 31;
		case 5:
			i += 30;
		case 4:
			i += 31;
		case 3:
			if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0)) {
				i += 29;
			} else {
				i += 28;
			}
		case 2:
			i += 31;
		case 1:
			i += c;
		}
		System.out.println(i);
		sc.close();
	}
}
