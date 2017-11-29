package com.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于1000的整数：");
		int N = sc.nextInt();
		int sum = 0;
		if(N % 2 ==0){
			for (int i = 1; i <=N; i++) {
				if(i % 2 == 0){
					sum =sum+i;
				}
				
			}
			
		}else{
			for (int i = 1; i <=N; i++) {
				if(i % 2 != 0){
					sum =sum+i;
				}
			}
		}
		System.out.println(sum);
	}
}
