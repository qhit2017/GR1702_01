/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月14日 上午8:43:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class RunningTotal {
	public static void main(String[] args) {
		// 求整数1~100的累加值，但要求跳过个位为3的数
		int sum = 0;
		// 用for循环累加
		for (int i = 1; i <= 100; i++) {

			if (!(i % 10 == 3)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
