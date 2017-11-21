package com.zk.qhit.statictest;

import java.util.Scanner;

//4、一个5位数，判断它是不是回文数。即12321是回文数，
//个位与万位相同，十位与千位相同。
public class FourTest {
	public static void main(String[] args) {
		System.out.println("第四题:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a / 10000 == a % 10 && a / 1000 % 10 == a / 10 % 10) {
			System.out.println(a + "是回文数");
		} else {
			System.out.println(a + "不是回文数");
		}
		sc.close();
	}
}
