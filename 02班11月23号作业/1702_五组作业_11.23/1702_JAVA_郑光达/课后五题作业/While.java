/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月23日 下午7:05:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class While {

	public static void main(String[] args) {

		// 计算1~100之间奇数的和

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
				
			}i++;
		}
		System.out.println(sum);
	}

}
