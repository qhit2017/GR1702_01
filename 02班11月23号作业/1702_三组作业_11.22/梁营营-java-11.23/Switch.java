package com.test;

import java.util.Scanner;

//��ҵ�ģ�
//���ߣ���ӪӪ��
public class Switch {

	public static void main(String[] args) {
		// �Ӽ�������1~7�����֣����������1�����������һ�����������2����������ڶ�........���������7,�����������(��switch)
		 Scanner sc = new Scanner(System.in);
			System.out.println("������1~7������һ�����֣�");
			int i = sc.nextInt();
			System.out.println("������������ǣ�"+i);
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
		default:
			break;
		}sc.close();
	}
}
