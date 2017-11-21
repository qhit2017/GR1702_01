package com;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();

		if (a < b) {
			System.out.println(a + "小于" + b);
		} else if (a > b) {
			System.out.println(a + "大于" + b);
		} else {
			System.out.println(a + "等于" + b);
		}
		sc.close();
	}

}
