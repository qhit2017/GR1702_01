package com.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个小数：");
		double a = sc.nextDouble();
		System.out.println("你输入的第一个小数是："+a);
		double b = sc.nextDouble();
		System.out.println("你输入的第二个小数是："+b);
		if(a>b){
			System.out.println(a+">"+b);
		}else{
			System.out.println(a+"<"+b);
		}sc.close();
	}
}
