/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月19日 下午4:10:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		double a = sc.nextDouble();
		System.out.println("请输入第二个数：");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a == b) {
			System.out.println(a + "=" + b);
		} else {
			System.out.println(a + "<" + b);
		}

	}
}
