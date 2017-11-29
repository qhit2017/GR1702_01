package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:36:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入一个三位数:");
		
		int a = sc.nextInt();

		int b = a / 10 % 10;

		System.out.println("这个三位数的十位数是：" + b);

		sc.close();
	}
}
