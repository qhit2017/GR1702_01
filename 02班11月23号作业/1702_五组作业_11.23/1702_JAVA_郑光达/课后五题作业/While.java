/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��23�� ����7:05:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class While {

	public static void main(String[] args) {

		// ����1~100֮�������ĺ�

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
				
			}i++;
		}
		System.out.println(sum);
	}

}
