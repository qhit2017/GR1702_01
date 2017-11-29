package com.test;

import java.util.Scanner;

//作业六；
//作者：梁营营；
public class Order {
	public static void main(String[] args) {
		// 从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。
		System.out.println("输入的数值是：");
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		System.out.println("输入的第一个数是：" + a);
		int b = number.nextInt();
		System.out.println("输入的第二个数是：" + b);
		int c = number.nextInt();
		System.out.println("输入的第三个数是：" + c);
		int d = number.nextInt();
		System.out.println("输入的第四个数是：" + d);

		// 条件；
		int i;
		if (a < b) {
			i = a;
			a = b;
			b = i;

		}

		if (a < c) {
			i = a;
			a = c;
			c = i;

		}
		if (a < d) {
			i = a;
			a = d;
			d = i;

		}

		if (b < c) {
			i = b;
			b = c;
			c = i;

		}
		
		if (b < d) {
			i = b;
			b = d;
			d = i;
		}

		if (c < d) {
			i = c;
			c = d;
			d = i;

		}

		

		System.out.println("a、b、c、d的顺序排列为："+a +"\t"+">"+ "\t" + b + "\t" +">"+ "\t"+ c + "\t"+">"+ "\t" + d);
	}
}
