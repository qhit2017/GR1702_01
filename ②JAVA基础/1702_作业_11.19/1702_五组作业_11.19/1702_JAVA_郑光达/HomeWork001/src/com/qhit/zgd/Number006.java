/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:35:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number006 {

	public static void main(String[] args) {

		int a;
		int sum = 0;
		for (a = 1; a <= 10; a++) {
			sum = sum + a;
			if (sum >= 20) {
				System.out.println(a);
				break;
			}
		}
	}
}
