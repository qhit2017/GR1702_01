package com.qhit;

import java.util.Scanner;

public class Compare {
	
	public static void main(String[] args) {
		//�Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳���������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������a:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������b:");
		int b = sc.nextInt();
		System.out.println("���������������c:");
		int c = sc.nextInt();
		System.out.println("��������ĸ�����d:");
		int d = sc.nextInt();
		int e =0;
		if(a>b){
			e=a;
			a=b;
			b=e;
		}
		if(a>c){
			e=a;
			a=c;
			c=e;
		}
		if(a>d){
			e=a;
			a=d;
			d=e;
		}
		if(b>c){
			e=b;
			b=c;
			c=e;
		}
		if(b>d){
			e=b;
			b=d;
			d=e;
		}
		if(c>d){
			e=c;
			c=d;
			d=e;
		}
		
		
		System.out.println("�Ӵ�С�������У�"+"\n"+d+"\t"+c+"\t"+b+"\t"+a);
		
		sc.close();
		}
		
	}


