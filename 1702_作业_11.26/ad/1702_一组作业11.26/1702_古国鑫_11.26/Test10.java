package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:37:20 
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
