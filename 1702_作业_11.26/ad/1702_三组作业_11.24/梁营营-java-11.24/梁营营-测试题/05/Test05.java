package com.test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入数值：");
		int x = sc.nextInt();
		System.out.println("你输入的数字是："+x);
		int y = sc.nextInt();
		System.out.println("你输入的数字是："+y);
		int z = sc.nextInt();
		System.out.println("你输入的数字是："+z);
		int h=0;
		if (x>y) {
			h=x;
			x=y;
			y=h;
		}
		if (x>z) {
			h=x;
			x=z;
			z=h;
		}
		if (y>z) {
			h=y;
			y=z;
			z=h;
		}
		System.out.println(x+"<"+y+"<"+z);
	}

}
