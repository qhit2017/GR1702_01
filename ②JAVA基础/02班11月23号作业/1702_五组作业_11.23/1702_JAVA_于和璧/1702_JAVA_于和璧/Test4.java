package com.zk;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
	//�Ӽ�������1~7�����֣����������1�����������һ�����������2��
	//��������ڶ�........���������7,�����������(��switch)
	Scanner sc = new Scanner(System.in);
	System.out.println("������1~7������");
	int a = sc.nextInt();
	switch (a) {
	case 1:
		System.out.println("��������1");
		break;
	case 2:
		System.out.println("��������2");
		break;
	case 3:
		System.out.println("��������3");
		break;
	case 4:
		System.out.println("��������4");
		break;
	case 5:
		System.out.println("��������5");
		break;
	case 6:
		System.out.println("��������6");
		break;
	case 7:
		System.out.println("����������");
		break;

	default:
		System.out.println("��Ǹ������������������룡");
		break;
	}
	sc.close();
	
	}

}
