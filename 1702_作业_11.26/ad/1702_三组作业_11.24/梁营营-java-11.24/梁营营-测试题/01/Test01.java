package com.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��С����");
		double a = sc.nextDouble();
		System.out.println("������ĵ�һ��С���ǣ�"+a);
		double b = sc.nextDouble();
		System.out.println("������ĵڶ���С���ǣ�"+b);
		if(a>b){
			System.out.println(a+">"+b);
		}else{
			System.out.println(a+"<"+b);
		}sc.close();
	}
}
