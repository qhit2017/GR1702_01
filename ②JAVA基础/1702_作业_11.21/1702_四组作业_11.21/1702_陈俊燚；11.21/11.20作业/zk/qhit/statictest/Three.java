package com.zk.qhit.statictest;

import java.util.Scanner;

//输入三个整数x,y,z，请把这三个数由小到大输出
public class Three {
	public static void main(String[] args) {
		System.out.println("第三题");
		int x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数：");
		x = sc.nextInt();
		System.out.println("请输入第2个数：");
		y = sc.nextInt();
		System.out.println("请输入第3个数：");
		z = sc.nextInt();
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x > z) {
			int t = x;
			x = z;
			z = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		System.out.println("三个数字由小到大的排序为：" + x + "<" + y + "<" + z);

	}
}