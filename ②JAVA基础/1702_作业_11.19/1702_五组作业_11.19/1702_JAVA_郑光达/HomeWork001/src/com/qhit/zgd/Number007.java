/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��19�� ����4:39:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number007 {

	public static void main(String[] args) {
		int a, b;

		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= 5; b++) {
				if (a == b) {
					continue;
				}
				System.out.print(a);
				System.out.println(b);
			}
		}
	}
}
