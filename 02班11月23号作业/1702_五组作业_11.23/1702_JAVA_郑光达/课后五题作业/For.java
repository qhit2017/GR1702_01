/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月23日 下午7:05:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class For {

	public static void main(String[] args) {

		// 计算1~100之间奇数的和

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
