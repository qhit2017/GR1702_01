package com.week;

import java.util.Scanner;

/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 上午8:45:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Week {
	
	public static void main(String[] args) {
		 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请从1~7之间输入一个数.");
		
		int a = sc.nextInt();
		
		switch(a){
		case 1:
			System.out.println("今天星期一");
			break;
		case 2:
			System.out.println("今天星期二");
			break;
		case 3:
			System.out.println("今天星期三");
			break;
		case 4:
			System.out.println("今天星期四");
			break;
		case 5:
			System.out.println("今天星期五");
			break;
		case 6:
			System.out.println("今天星期六");
			break;
		case 7:
			System.out.println("今天星期天");
			break;
		}
	}

}
