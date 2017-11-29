package com.zk.qhit;

import java.util.Scanner;

public class Judge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("是正数" + a);
		} else {
			System.out.println("是负数" + a);
		}
		sc.close();
	}
}
