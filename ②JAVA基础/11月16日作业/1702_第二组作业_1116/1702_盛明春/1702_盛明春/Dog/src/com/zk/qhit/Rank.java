package com.zk.qhit;

import java.util.Scanner;

//从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。
public class Rank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("请输入第三个数");
		int c = sc.nextInt();
		System.out.println("请输入第四个数");
		int d = sc.nextInt();
		int f;
		if (a > b) {
			f = a;
			a = b;
			b = f;
		}
		if (a > c) {
			f = a;
			a = c;
			c = f;
		}
		if (a > d) {
			f = a;
			a = d;
			d = f;
		}
		if (b > c) {
			f = b;
			b = c;
			c = f;
		}
		if (b > d) {
			f = b;
			b = d;
			d = f;
		}
		if (c > d) {
			f = c;
			c = d;
			d = f;
		}
		System.out.print("从大到小的排列顺序是：" + d + "\t" + c + "\t" + b + "\t" + a);
		sc.close();
	}
}
