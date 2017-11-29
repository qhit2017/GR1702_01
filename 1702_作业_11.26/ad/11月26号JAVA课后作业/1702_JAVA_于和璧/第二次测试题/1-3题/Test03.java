package com.zk;

import java.util.Scanner;

public class Test03 {
	
	//编辑JAVA程序，通过控制台输入一个整数N(N不大于10000)，判断该数是几位数，并输出结果。
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个不大于10000整数N：");
		
		int N = sc.nextInt();
		
		if(N>0 && N<10){
			
			System.out.println("该数为一位数");
		}else if(N>=10 && N<100){
			
			System.out.println("该数为两位数");
		}else if(N>=100 && N<1000){
			
			System.out.println("该数为三位数");
		}else if(N>=1000 && N<10000){
			
			System.out.println("该数为四位数");
		}else if(N==10000){
			
			System.out.println("该数为五位数");
		}
		
		
	}

}
