package guo;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
	public static void main(String[] args) {
		//  �Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳�����������	
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		System.out.println("���������������");
		int c=sc.nextInt();
		System.out.println("��������ĸ�����");
		int d =sc.nextInt();
		//
		int e;
		if(a>b){
			e=a;
			a=b;
			b=e;
	}
		int f;
		if(b>c){
			f=b;
			b=c;
			c=f;
		}
		int g;
		if(c>d){
			g=c;
			c=d;
			d=g;
	}
		int h;
		if(a>c){
			h=a;
			a=c;
			c=h;
	}
		int j;
		if(a>d){
			j=a;
			a=d;
			d=j;
	}
		int k;
		if(b>d){
			k=b;
			b=d;
			d=k;
	}
		int l;
		if(c>d){
			l=c;
			c=d;
			d=l;
			
		}
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
	}

}
