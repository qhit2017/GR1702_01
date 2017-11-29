package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:36:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入成绩：");
		
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.println("A");
		}

		if (a >= 60 && a <= 89) {
			System.out.println("B");
		}

		if (a < 60) {
			
			System.out.println("C");
			
			sc.close();
		}
	}
}
