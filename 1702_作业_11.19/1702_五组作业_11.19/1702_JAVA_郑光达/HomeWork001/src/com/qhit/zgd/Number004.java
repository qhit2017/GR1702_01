/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:21:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number004 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (int b = 8; i <= 1000; i++) {

			if (i % 8 == 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println(sum);

	}

}
