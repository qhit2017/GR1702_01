package com.qk;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月23日上午8:24:23
 *邮箱：2507147605@qq.com
 */
public class Test07 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入一个不大于10000的数");
	double n=sc.nextDouble();
	for(int a =1;a<=n;a++){
		if(a%7==0||a%10==7){
			System.out.println(a);
		}
	}
}
}
