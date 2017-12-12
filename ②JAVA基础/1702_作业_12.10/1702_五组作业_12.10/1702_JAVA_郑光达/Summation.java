/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午4:46:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.homework;

public class Summation {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
