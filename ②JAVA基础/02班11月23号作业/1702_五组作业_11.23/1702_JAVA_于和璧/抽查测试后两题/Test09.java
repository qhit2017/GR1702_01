package com.qhit;

import java.util.Scanner;

public class Test09 {
	//编写JAVA程序，通过控制台输入一个整数N，（N不大于10000，输出所有7的倍数和包含7的数字。
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数N：");
		
		int N =sc.nextInt();
		if(N>10000){
			
			System.out.println("抱歉！您输入的数字超出范围！");
			
		}else{
			System.out.println("此范围内所有7的倍数和包含7的数字有：");
			for(int a=1;a<=N;a++){
			
			if(a%7==0 || a/1000==7 || a/100%10==7 || a/10%10==7 || a%10==7){
				
				System.out.println(a);
			}
		}
		}
		sc.close();
	}
}
