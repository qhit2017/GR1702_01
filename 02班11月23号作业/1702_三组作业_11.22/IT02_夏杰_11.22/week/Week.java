package com.week;

import java.util.Scanner;

/**
 * @author  ����  E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date    ����ʱ��: 2017��11��23�� ����8:45:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Week {
	
	public static void main(String[] args) {
		 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("���1~7֮������һ����.");
		
		int a = sc.nextInt();
		
		switch(a){
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
		}
	}

}
