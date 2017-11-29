package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:37:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入一个不大于1000的整数:");
		
		int b = sc.nextInt();
		int sum = 0;
		int summ = 0;

		if (b % 2 == 0) {
			for (int a = 1; a <= b; a++) {
				if (a % 2 == 0) {
					sum += a;
				}
			}
			System.out.println("偶数和为：" + sum);
		}

		if (b % 2 != 0) {
			for (int d = 1; d <= b; d++) {
				if (d % 2 == 0) {
					sum += d;
				}
			}
			System.out.println("奇数和为：" + summ);
		}
			sc.close();
	}

}
