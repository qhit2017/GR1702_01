/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:10:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����:");
		double a = sc.nextDouble();
		System.out.println("������ڶ�������");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a == b) {
			System.out.println(a + "=" + b);
		} else {
			System.out.println(a + "<" + b);
		}

	}
}
