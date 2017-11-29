package com.tsinghua;

import java.util.Scanner;

public class HuWemShu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个五位整数：");
		int a = sc.nextInt();

		if ((a / 10000) == (a % 10) && (a /1000 % 10) == (a / 10 % 10)) {
			System.out.println(a+"是回文数");
			
		}
		else{
			System.out.println(a+"不是回文数");
		}
		sc.close();
	}
}
