package com.qk;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月21日下午8:03:26
 *邮箱：2507147605@qq.com
 */
public class Test9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数字:");
	double N=sc.nextDouble();
	for(int n=1;n<=1000;n++){
		if(n%7==0||n%10==7){
			System.out.println(n);
		}
	}
}
}
