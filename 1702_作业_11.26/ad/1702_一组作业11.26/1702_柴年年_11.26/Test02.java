
package com.qhit;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月23日 下午6:35:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个三位数");
		int a = sc.nextInt();
		int b = a/10%10;
		System.out.println(b);

	}
}

