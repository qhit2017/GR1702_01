package com.xqw.port;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����9:24:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class WhatDay {

	public static void main(String[] args) {
		System.out.println("�ġ��������֣�������ڼ�\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��1~7��������");
		int a=sc.nextInt();
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
			System.out.println("�������");
			break;
		}
		sc.close();

	}

}
