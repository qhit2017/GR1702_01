/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:05:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("�����Ǹ�����");
		} else if (a == 0) {
			System.out.println("0����һ��������");
		} else {
			System.out.println("������һ������");
		}
	}
}
