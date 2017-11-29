/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:40:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number008 {

	public static void main(String[] args) {
		int i =1;
		int a;
		for (a = 1; a <= 1000; a++) {
			if (a % 10 == 6 & a % 3 == 0) {
				i++;
			}
		}System.out.println(i);
	}

}
