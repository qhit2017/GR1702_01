package com.zk.qhit.statictest;

import java.util.Scanner;

//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 
public class Fore {
	public static void main(String[] args) {
		System.out.println("第四题");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数");
		int a = sc.nextInt();
		if ((a % 10 == a / 10000) && (a / 1000 % 10 == a / 10 % 10)) {
			System.out.println("该数是回文数");
		} else {
			System.out.println("该数不是回文数");
		}

	}
}