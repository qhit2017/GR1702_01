/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��21�� ����6:56:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test08 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				sum++;

			}

		}
		System.out.println(sum);
	}

}
