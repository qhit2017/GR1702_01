package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:37:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test10 {

	public static void main(String[] args) {

		int year = 1900;

		while (year < 2017) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year);

			}
			year++;
		}

	}
}
