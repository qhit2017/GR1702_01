/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��14�� ����8:43:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class RunningTotal {
	public static void main(String[] args) {
		// ������1~100���ۼ�ֵ����Ҫ��������λΪ3����
		int sum = 0;
		// ��forѭ���ۼ�
		for (int i = 1; i <= 100; i++) {

			if (!(i % 10 == 3)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
