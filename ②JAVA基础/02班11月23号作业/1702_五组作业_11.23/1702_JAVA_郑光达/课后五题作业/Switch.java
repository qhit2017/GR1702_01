/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月23日 下午6:58:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字，以快捷键结束。");
		int a = sc.nextInt();

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
			if (a > 7) {
				System.out.println("您输入的数字有误。");
			}
			break;
		}
	}

}
