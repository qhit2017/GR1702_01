package com.qi.ke;

import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年11月19日下午7:06:36
 *邮箱：2507147605@qq.com
 */
public class zhengshu {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("请输入第一个数");
	int a=in.nextInt();
	System.out.println("请输入第二个数");
	int b =in.nextInt();
	System.out.println("请输入第三个数");
	int c =in.nextInt();
	System.out.println("请输入第四个数");
	int d=in.nextInt();
	int j;
	if (a>b){
		j=a;
		a=b;
		b=j;
	}
	if(a>c){
		j=a;
		a=c;
		c=j;
	}
	if(a>d){
		j=a;
		a=d;
		d=j;
}
	if(b>c){
		j=b;
		b=c;
		c=j;
	}
	if(b>d){
		j=b;
		b=d;
		d=j;
	}
	if(c>d){
		j=c;
		c=d;
		d=j;
	}
	System.out.println(d+" >"+c+"> "+b+" >"+a);
}
}