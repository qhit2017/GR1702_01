package com.zk.qhit;

import java.util.Scanner;

public class Integer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ����");
	int a = sc.nextInt();
	System.out.println("������ڶ�����");
	int b = sc.nextInt();
	System.out.println("�������������");
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
	System.out.println("��С�����˳����:"+c+"\t"+b+"\t"+a);
	sc.close();
}
}
