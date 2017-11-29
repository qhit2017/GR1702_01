/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:35:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number006 {

	public static void main(String[] args) {

		int a;
		int sum = 0;
		for (a = 1; a <= 10; a++) {
			sum = sum + a;
			if (sum >= 20) {
				System.out.println(a);
				break;
			}
		}
	}
}
