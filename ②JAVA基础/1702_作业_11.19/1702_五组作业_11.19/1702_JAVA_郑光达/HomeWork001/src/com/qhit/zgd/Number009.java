/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:47:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С��10000�����֣�");
		int a = sc.nextInt();
		if (a <= 10000) {

			for (int i = 7; i <= a; i++) {

				if (i == 7 || i % 7 == 0 || i % 1000 / 100 == 7 || i % 10 == 7
						|| i % 100 / 10 == 7) {
					System.out.println(i);
				}
			}
		}
	}

}
