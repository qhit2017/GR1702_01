package com.xxy;

import java.util.Scanner;

public class Review1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("�Ӽ�������1~7������");
	int a = sc.nextInt();
	
	switch (a) {
	case 1:
		System.out.println("����һ");
		break;
	case 2:
		System.out.println("���ڶ�");
		break;
	case 3:
		System.out.println("������");
		break;
	case 4:
		System.out.println("������");
		break;
	case 5:
		System.out.println("������");
		break;
	case 6:
		System.out.println("������");
		break;
	case 7:
		System.out.println("������");
		break;


	}
	if (a>7) {
		System.out.println("�����������������1~7������");
	}
	if (a<1) {
		System.out.println("�����������������1~7������");
	}
		
	
System.out.println();
	
}
}
