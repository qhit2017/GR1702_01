/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��21�� ����6:50:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum >= 20) {
				System.out.println(a);
				break;
			}
		}
	}

}
