package com.zk;

import java.util.Scanner;

public class Test01 {
	
	//编写JAVA程序，通过控制台输入两个小数，判断两个小数是否相等，并输出判断结果。
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入小数a:");
		double a = sc.nextDouble();
		System.out.println("请输入小数b:");
		double b = sc.nextDouble();
		
		if(a==b){
			
			System.out.println("a和b相等");
			
		}else{
			
			System.out.println("a和b不相等");
		}
		
		sc.close();
		
		
		
	}

}
