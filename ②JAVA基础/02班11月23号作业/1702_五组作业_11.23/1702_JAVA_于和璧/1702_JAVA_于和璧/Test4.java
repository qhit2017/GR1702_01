package com.zk;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
	//从键盘输入1~7的数字，如果数字是1，则输出星期一，如果数字是2，
	//则输出星期二........如果数字是7,则输出星期日(用switch)
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入1~7的数字");
	int a = sc.nextInt();
	switch (a) {
	case 1:
		System.out.println("今天星期1");
		break;
	case 2:
		System.out.println("今天星期2");
		break;
	case 3:
		System.out.println("今天星期3");
		break;
	case 4:
		System.out.println("今天星期4");
		break;
	case 5:
		System.out.println("今天星期5");
		break;
	case 6:
		System.out.println("今天星期6");
		break;
	case 7:
		System.out.println("今天星期天");
		break;

	default:
		System.out.println("抱歉！输入错误，请重新输入！");
		break;
	}
	sc.close();
	
	}

}
