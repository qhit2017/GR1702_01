package com;

import java.util.Scanner;

public class Judge {
public static void main(String[] args) {
	/**
	 * 编写Java程序，键盘输入一个数，判断大小
	 */
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个数：");
	int a = sc.nextInt();
	if(a>0){
		System.out.println("该数为正数："+a);
	}else if(a<0){
		System.out.println("该数为负数："+a);
	}else{
		System.out.println("该数既不是正数也不是负数");
	}
	sc.close();
}
}
