package com.zk.qhit;

import java.util.Scanner;

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
		int i;
		if (a > b) {
			i = a;
			a = b;
			b = i;
		}
		if (a > c) {
			i = a;
			a = c;
			c = i;
		}
		if (a > d) {
			i = a;
			a = d;
			d = i;
		}
		if (b > c) {
			i = b;
			b = d;
			d = i;
		}
		if (c > d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println("从大到小的顺序是:" + d + "\t" + c + "\t" + b + "\t" + a);
sc.close();
	}
}
