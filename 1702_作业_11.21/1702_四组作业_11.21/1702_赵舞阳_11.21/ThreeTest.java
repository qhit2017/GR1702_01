package com.zk.qhit.statictest;

import java.util.Scanner;

//3、输入三个整数x,y,z，请把这三个数由小到大输出。
public class ThreeTest {
	public static void main(String[] args) {
		System.out.println("第三题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数:");
		int x = sc.nextInt();
		System.out.println("请输入第2个数:");
		int y = sc.nextInt();
		System.out.println("请输入第3个数:");
		int z = sc.nextInt();
		int a;
		if (x < y) {
			a = x;
			x = y;
			y = a;
		}
		if (x < z) {
			a = x;
			x = z;
			z = a;
		}
		if (y < z) {
			a = y;
			y = z;
			z = a;
		}
		System.out.println("从小到大的顺序排列输出:" + z + " " + y + " " + x);
		sc.close();
	}
}
