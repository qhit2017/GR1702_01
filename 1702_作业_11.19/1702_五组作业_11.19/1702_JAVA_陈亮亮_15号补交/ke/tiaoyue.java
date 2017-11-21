package com.qi.ke;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月17日上午8:01:31
 *邮箱：2507147605@qq.com
 */
public class tiaoyue {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入多少米：");
	double a = sc.nextDouble();
	System.out.println("请输入次数：");
	double b = sc.nextDouble()/2;
	int i = 0;
	for(i = 2;i<=10;i++){
	a= a+b*2;
	b=b/2;
	}
	System.out.println(i+"次"+"共经历"+a+"米");
	System.out.println(i+"次反弹"+b+"米");
	
}
}
