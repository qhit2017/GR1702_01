package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午4:34:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test09 {

	//编写JAVA程序，通过控制台输入一个整数N，（N不大于10000，输出所有7的倍数和包含7的数字。
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个不大于10000的数:");
		
		int N = sc.nextInt();
		
		if(N>10000){
				
			System.out.println("输入的数字超出范围！");
			
		}
		
		for (int i = 1; i <= 10000; i++) {
			
			if (i / 1000 == 7 || i / 100 == 7 ||i / 10 % 10 == 7 || i % 10 == 7 || i % 7 == 0 ) {
				
				System.out.println(i);
			}
		}
		sc.close();
	}
}
