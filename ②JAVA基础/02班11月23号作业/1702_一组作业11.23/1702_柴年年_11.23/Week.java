package com.qhit.Week;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 上午9:06:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个值");
		int a = sc.nextInt();
		switch (a) {
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
		default:
			System.out.println("你输入的值有误!");
			break;
		}
	}
}
