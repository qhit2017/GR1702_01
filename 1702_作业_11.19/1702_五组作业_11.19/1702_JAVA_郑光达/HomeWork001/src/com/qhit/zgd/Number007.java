/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:39:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number007 {

	public static void main(String[] args) {
		int a, b;

		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= 5; b++) {
				if (a == b) {
					continue;
				}
				System.out.print(a);
				System.out.println(b);
			}
		}
	}
}
