package com.qk;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月23日下午7:31:51
 *邮箱：2507147605@qq.com
 */
public class Xingqitian {
public static void main(String[] args) {
//从键盘输入1~7的数字，如果数字是1，则输出星期一，如果数字
//是2，则输出星期二........如果数字是7,则输出星期日(用
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入数字，按0结束");
int a= sc. nextInt();
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

