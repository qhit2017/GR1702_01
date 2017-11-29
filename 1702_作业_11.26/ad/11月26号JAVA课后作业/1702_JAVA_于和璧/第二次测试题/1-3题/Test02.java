package com.zk;

import java.util.Scanner;

public class Test02 {

	//编写JAVA程序，输入一个三位数，输出该数的十位是多少。
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个三位数a：");
		
		int a = sc.nextInt();
		
		int b = a/10%10;
		
		System.out.println(b);
		
	}
}
