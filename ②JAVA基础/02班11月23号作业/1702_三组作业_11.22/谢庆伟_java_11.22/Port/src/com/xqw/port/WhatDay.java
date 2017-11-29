package com.xqw.port;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月23日 上午9:24:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class WhatDay {

	public static void main(String[] args) {
		System.out.println("四、输入数字，输出星期几\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个1~7的整数：");
		int a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		sc.close();

	}

}
