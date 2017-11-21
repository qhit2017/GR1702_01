package com.zk.qhit;

import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	//
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.println("请输入一个数字");
	if (i%10==i/10000 && i/1000%10==i/10%10) {
		System.out.println(i+"是回文数：");
		
	}else{
		System.out.println(i+"不是回文数");
	}
	sc.close();
}
}
