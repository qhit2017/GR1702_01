package com.qk;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��23������7:31:51
 *���䣺2507147605@qq.com
 */
public class Xingqitian {
public static void main(String[] args) {
//�Ӽ�������1~7�����֣����������1�����������һ���������
//��2����������ڶ�........���������7,�����������(��
	Scanner sc = new Scanner(System.in);
	System.out.println("���������֣���0����");
int a= sc. nextInt();
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
	default:
		if (a > 7) {
			System.out.println("���������������");
		}
		break;
	}
	}
}

