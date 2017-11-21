package com.zk.qhit.statistest;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月20日下午7:24:22
 *邮箱：2507147605@qq.com
 */
public class huiwenshu {
public static void main(String[] args) {
	//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数");
	
	int a =sc.nextInt();
	if(a%10== a/10000&&a%10000/1000==a %100/10){
		System.out.println(a+"是一个回文数");
	}else{
		System.out.println(a+"不是一个回文数");	
	}
}
}
