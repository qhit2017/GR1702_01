/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月21日 下午7:14:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test10 {

	public static void main(String[] args) {
		int a = 1;

		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(b + "*" + a + "=" + a * b + "\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
