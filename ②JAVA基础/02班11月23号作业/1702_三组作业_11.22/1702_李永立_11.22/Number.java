package com.lyl;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1~ 7之间的数字");
		int i = sc.nextInt();
		if (i<1||i>7) {
			System.out.println("输入有误，请重新输入");
			
		}
		
		switch (i) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
			
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
			
			
		}
	}

}
