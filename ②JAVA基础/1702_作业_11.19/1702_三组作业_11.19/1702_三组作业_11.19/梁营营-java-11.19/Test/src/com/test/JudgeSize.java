package com.test;

import java.util.Scanner;

//作业二：
//作者：梁营营；
public class JudgeSize {
public static void main(String[] args) {
	//通过控制台输入两个小数，判断两个小数大小，并输出判断结果；
	System.out.println("输入数值：");
	Scanner number = new Scanner(System.in);
	double a = number.nextDouble();
	System.out.println("输入的第一个小数是："+a);
	double b = number.nextDouble();
	System.out.println("输入的第二个小数是："+b);
	if(a>b){
		System.out.println(a+">"+b);
	}else if(a<b){
		System.out.println(a+"<"+b);
	}else if(a==b){
		System.out.println(a+"="+b);
	}
	number.close();
}
}
