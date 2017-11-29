package com;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("输入1~7");
		int day = sc.nextInt();

		switch (day) {

		case 1:
			System.out.println("周一");
			break;

		case 2:
			System.out.println("周二");
			break;

		case 3:
			System.out.println("周三");
			break;

		case 4:
			System.out.println("周四");
			break;

		case 5:
			System.out.println("周五");
			break;

		case 6:
			System.out.println("周六");
			break;

		case 7:
			System.out.println("星期日");
			break;
		}
		sc.close();
	}

}
