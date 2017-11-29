/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:05:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("该数是个正数");
		} else if (a == 0) {
			System.out.println("0不是一个正负数");
		} else {
			System.out.println("该数是一个负数");
		}
	}
}
