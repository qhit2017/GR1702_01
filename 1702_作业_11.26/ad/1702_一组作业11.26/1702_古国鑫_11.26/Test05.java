package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:36:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		System.out.println("�������һ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("������ڶ�����");

		int b = sc.nextInt();
		;
		System.out.println("�������������");
		int c = sc.nextInt();
		;
		int j = 0;

		if (a > b) {
			j = a;
			a = b;
			b = j;
		}

		if (a > c) {
			j = a;
			a = c;
			c = j;
		}

		if (b > c) {
			j = b;
			b = c;
			c = j;
		}
		System.out.println(a + "<" + b + "<" + c);
		sc.close();
	}
}

