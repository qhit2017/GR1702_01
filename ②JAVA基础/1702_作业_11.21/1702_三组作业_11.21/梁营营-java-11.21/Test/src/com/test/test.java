package com.test;

import java.util.Scanner;

//作者：梁营营；
//作业三：
public class test {

	public static void main(String[] args) {
		// 输入三个整数x,y,z，请把这三个数由小到大输出。
		Scanner number = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = number.nextInt();
		System.out.println("输入的第一个整数是：" + x);
		int y = number.nextInt();
		System.out.println("输入的第二个整数是：" + y);
		int z = number.nextInt();
		System.out.println("输入的第三个整数是：" + z);
		int k;
		if (x < y) {
			k = x;
			x = y;
			y = k;
		}
		if (x < z) {
			k = x;
			x = z;
			z = k;
		}
		if (y < z) {
			k = y;
			y = z;
			z = k;
		}

		System.out.println(x + "<" + y + "<" + z);
		number.close();
	}
}
