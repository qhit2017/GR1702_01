package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int i = sc.nextInt();
		System.out.println("你输入的三位数是：" + i);
		if (i > 1000) {
			System.out.println("输入有误，请重新输入！");
		} else {
			for (int j = 0; j <= 9; j++) {
				if (i / 10 % 10 == j) {
					System.out.println("输入的三位数的十位数字为：" + j);
				}
			}
			sc.close();
		}

	}

}
