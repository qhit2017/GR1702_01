package com.zk.qhit.statictest;

import java.util.Scanner;

public class judge {
public static void main(String[] args) {
	
	//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个五位数");
	int a = sc.nextInt();
	if(a/10000==a%10&&a%10000/1000==a%100/10){
		System.out.println(a+"回文数");
	}else{
		System.out.println(a+"不是回文数");
	}
}
}
