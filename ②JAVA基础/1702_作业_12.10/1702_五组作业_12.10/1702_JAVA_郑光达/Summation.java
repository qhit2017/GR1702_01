/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����4:46:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.homework;

public class Summation {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
