package com.qhit.Week;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����9:06:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��ֵ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("��������һ");
			break;
		case 2:
			System.out.println("�������ڶ�");
			break;
		case 3:
			System.out.println("����������");
			break;
		case 4:
			System.out.println("����������");
			break;
		case 5:
			System.out.println("����������");
			break;
		case 6:
			System.out.println("����������");
			break;
		case 7:
			System.out.println("����������");
			break;
		default:
			System.out.println("�������ֵ����!");
			break;
		}
	}
}
