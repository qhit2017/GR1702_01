package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��16�� ����9:15:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work6 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ������");
	int a = sc.nextInt();
	System.out.println("������ĵ�һ�����ǣ�"+a);
	
	System.out.println("������ڶ�������");
	int b = sc.nextInt();
	System.out.println("������ĵڶ������ǣ�"+b);
	
	System.out.println("���������������");
	int c = sc.nextInt();
	System.out.println("������ĵ��������ǣ�"+c);
	
	System.out.println("��������ĸ�����");
	int d = sc.nextInt();
	System.out.println("������ĵ��ĸ����ǣ�"+d);
	int i;
	if(a<b){
		i=a;
		a=b;
		b=i;
		
	}
	if(a<c){
		i=a;
		a=c;
		c=i;
	}
	if(a<d){
		i=a;
		a=d;
		d=i;
	}
	
	if(b<c){
		i=b;
		b=c;
		c=i;
	}
	if(b<d){
		i=b;
		b=d;
		d=i;
	}
	if(c<d){
		i=c;
		c=d;
		d=i;
	}
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}
