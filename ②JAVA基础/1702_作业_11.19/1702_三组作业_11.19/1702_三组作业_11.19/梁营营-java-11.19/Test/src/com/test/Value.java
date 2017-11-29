package com.test;

import java.util.Scanner;

//第一题；
//作者：梁营营；
public class Value {
	public static void main(String[] args) {
		// 通过控制台输入一个数字，判断该数字是正数还是负数，并输出结果。
		System.out.println("请输入数值：");
		Scanner number = new Scanner (System.in);
		int a = number.nextInt();
		System.out.println("你输入的数值是："+a);
		if(a>0){
			System.out.println("输入的值是正数");
		}else if (a<0){
			System.out.println("输入的值是负数");
		}else if (a==0){
			System.out.println("输入的值是非正非负");
		}
		number.close();
	}
}
