/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��21�� ����7:01:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			if (i % 7 == 0 || i / 1000 == 7 || i / 100 == 7
					|| i % 10 / 10 == 7 || i % 10 == 7) {
				System.out.println(i);
			}
		}
	}

}
