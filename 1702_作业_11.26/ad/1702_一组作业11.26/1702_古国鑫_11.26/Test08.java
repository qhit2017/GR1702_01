package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:37:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for (int a = 1; a < 10000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				count++;

			}

		}
		System.out.println("10000���ڸ�λ��Ϊ6�����ܱ�3����������:" + count + "��");
	}
}
