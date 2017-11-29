package com.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的整数：");
		int N = sc.nextInt();
		int a = 0;
		if(N>10000){
			System.out.println("输入有误，请重新输入！");
		}else{
			for (int i =N; i>0; i=i/10) {
				a++;
			}
			System.out.println(N+"是"+a+"位数");
		}sc.close();
	}
}
