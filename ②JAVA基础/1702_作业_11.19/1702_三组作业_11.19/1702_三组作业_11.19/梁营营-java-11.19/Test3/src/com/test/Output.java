package com.zk;

import java.util.Scanner;

public class Test3 {
	// 作业九；
	// 作者：梁营营；

	public static void main(String[] args) {
		// 通过控制台输入一个整数N，（N不大于10000），输出所有7的倍数和包含7的数字。
		System.out.println("输入一个不大于10000的数字：");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		if (n > 10000) {
			System.out.println("数字不能大于10000");
		} else {
			for (int i = 1; i < n; i++) {
				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
			number.close();
		}

	}
}
