/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��13�� ����9:05:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number {

	public static void main(String[] args) {
		// һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.����ҳ�1000���ڵ�����������
		int number = 1;
		for (int i = 1; i < 1000; i++) {
			int a = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					a += j;
			if (a == i)
				System.out.print(i + "\t");

		}
	}
}
