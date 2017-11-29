package com.xx;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个数");
		long s = sc.nextLong();
		int a = 0;
		if(s<0||s>10000){
			System.out.println("输入错误");
		}else{
			while(s>0){
				s=s/10;
				a++;
			}
			System.out.println("您输入的数是"+a+"位数");
		}
		sc.close();
}
}
