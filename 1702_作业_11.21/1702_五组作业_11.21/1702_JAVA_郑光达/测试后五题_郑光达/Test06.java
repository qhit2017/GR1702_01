/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月21日 下午6:50:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum >= 20) {
				System.out.println(a);
				break;
			}
		}
	}

}
