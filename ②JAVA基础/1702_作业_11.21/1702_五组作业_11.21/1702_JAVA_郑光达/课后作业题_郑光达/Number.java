/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月20日 下午7:22:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int a = sc.nextInt();

		if (a % 10 == a / 10000 && a % 10000 / 1000 == a % 100 / 10) {
			System.out.println(a + "是一个回文数");
		} else {
			System.out.println(a + "不是一个回文数");
		}

	}

}
