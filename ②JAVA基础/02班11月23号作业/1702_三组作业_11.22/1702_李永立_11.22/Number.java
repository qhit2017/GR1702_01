package com.lyl;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1~ 7֮�������");
		int i = sc.nextInt();
		if (i<1||i>7) {
			System.out.println("������������������");
			
		}
		
		switch (i) {
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
	}

}
