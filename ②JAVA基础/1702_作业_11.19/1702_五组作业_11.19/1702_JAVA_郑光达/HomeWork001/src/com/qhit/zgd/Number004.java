/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:21:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number004 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (int b = 8; i <= 1000; i++) {

			if (i % 8 == 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println(sum);

	}

}
