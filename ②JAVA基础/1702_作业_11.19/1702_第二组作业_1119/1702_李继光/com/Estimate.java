package com;

import java.util.Scanner;

public class Estimate {
public static void main(String[] args) {
	/**
	 * ��дJava����ͨ������̨��������С�����жϴ�С
	 */
	Scanner sc=new Scanner(System.in);
	System.out.println("�������һ������");
	double a = sc.nextDouble();
	System.out.println("������ڶ�������");
	double b = sc.nextDouble();
	
	if(a>b){
		boolean c = true;	
		System.out.println("a>b���жϽ��Ϊ"+c);
	}else{
		boolean d = false;
		System.out.println("a>b���жϽ��Ϊ"+d);
	}
	sc.close();
}
}
