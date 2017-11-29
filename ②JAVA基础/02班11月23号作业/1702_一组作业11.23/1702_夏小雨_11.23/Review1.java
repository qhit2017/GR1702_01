package com.xxy;

import java.util.Scanner;

public class Review1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("从键盘输入1~7的数字");
	int a = sc.nextInt();
	
	switch (a) {
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
	if (a>7) {
		System.out.println("你输入的数字有误请1~7的数字");
	}
	if (a<1) {
		System.out.println("你输入的数字有误请1~7的数字");
	}
		
	
System.out.println();
	
}
}
