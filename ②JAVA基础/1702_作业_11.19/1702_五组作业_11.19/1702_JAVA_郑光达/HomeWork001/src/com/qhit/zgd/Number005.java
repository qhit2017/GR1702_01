/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:31:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number005 {

	public static void main(String[] args) {

		int a = 1;

		do {
			if (a % 5 == 0 && a % 3 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 1000);

	}

}
