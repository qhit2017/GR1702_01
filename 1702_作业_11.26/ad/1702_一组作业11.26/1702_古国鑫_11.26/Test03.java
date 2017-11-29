package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:36:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入一个不大于10000的整数：");
		
		int a = sc.nextInt();
		int b = 0;
		
		if (a < 0 || a >= 10000) {
			System.out.println("超出范围：");
		} else if (a == 0) {
			System.out.println("此数字是一位数");
		}
		
		while (a > 0) {
			a = a / 10;
			b++;
		}

		System.out.println("此数字是" + b + "位数");

		sc.close();
	}
}
