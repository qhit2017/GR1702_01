/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��20�� ����7:22:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a = sc.nextInt();

		if (a % 10 == a / 10000 && a % 10000 / 1000 == a % 100 / 10) {
			System.out.println(a + "��һ��������");
		} else {
			System.out.println(a + "����һ��������");
		}

	}

}
