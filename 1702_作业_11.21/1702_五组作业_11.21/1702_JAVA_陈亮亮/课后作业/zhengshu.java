package com.zk.qhit.statistest;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��20������7:16:21
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
	

	if(b>c){
		j=b;
		b=c;
		c=j;
	}
	System.out.println(a+" "+b+" "+c);
}
}
