package com.zk.qhit;

import java.util.Scanner;

public class Integer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数");
	int a = sc.nextInt();
	System.out.println("请输入第二个数");
	int b = sc.nextInt();
	System.out.println("请输入第三个数");
	int c= sc.nextInt();
	int i;
	if(a>b){
		i=a;
		a=b;
		b=i;
	}
	if(a>c){
		i=a;
		a=c;
		c=i;
	}
	if(b>c){
		i=b;
		b=c;
		c=i;
	}
	System.out.println("从小到大的顺序是:"+c+"\t"+b+"\t"+a);
	sc.close();
}
}
