package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��23�� ����7:14:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Day {

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
			System.out.println("�����ֵ������Χ");
			break;
		}
		sc.close();
	}
}
