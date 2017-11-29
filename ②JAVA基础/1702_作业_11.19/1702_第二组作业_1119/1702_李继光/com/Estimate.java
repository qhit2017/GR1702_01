package com;

import java.util.Scanner;

public class Estimate {
public static void main(String[] args) {
	/**
	 * 编写Java程序，通过控制台输入两个小数，判断大小
	 */
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入第一个数：");
	double a = sc.nextDouble();
	System.out.println("请输入第二个数：");
	double b = sc.nextDouble();
	
	if(a>b){
		boolean c = true;	
		System.out.println("a>b的判断结果为"+c);
	}else{
		boolean d = false;
		System.out.println("a>b的判断结果为"+d);
	}
	sc.close();
}
}
