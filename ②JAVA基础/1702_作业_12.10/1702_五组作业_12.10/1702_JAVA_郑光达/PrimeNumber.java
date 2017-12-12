/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午4:48:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.homework;

public class PrimeNumber {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for (i = 101; i <= 200; i++) {
			boolean primenumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primenumber = false;
					break;
				}
			}
			if (primenumber) {
				sum++;
				System.out.print(i + " ");
			}

		}
		System.out.println("\n总共有" + sum + "个素数");
	}

}
