package com.qi.ke;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��19������7:06:36
 *���䣺2507147605@qq.com
 */
public class zhengshu {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("�������һ����");
	int a=in.nextInt();
	System.out.println("������ڶ�����");
	int b =in.nextInt();
	System.out.println("�������������");
	int c =in.nextInt();
	System.out.println("��������ĸ���");
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