package com.xx;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	if(a==b){
		System.out.println("两数相等！");
	}else{
		System.out.println("两数不相等");
	}
	sc.close();
}
}
