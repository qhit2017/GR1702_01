package lishaoqing;

import java.util.Scanner;

public class Work_6 {
public static void main(String[] args) {
	Scanner z = new Scanner(System.in);
	System.out.println("�������һ����");
	double a =z.nextDouble();
	System.out.println("������ڶ�����");
	double b =z.nextDouble();
	System.out.println("�������������");
	double c =z.nextDouble();
	System.out.println("��������ĸ���");
	double d =z.nextDouble();
	
	double x=0;
	
	if(a<b){
		x=a;
		a=b;
		b=x;
	}
	if(a<c){
		x=a;
		a=c;
		c=x;
		
	}
	if(a<d){
		x=a;
		a=d;
		d=x;
	}
	if(b<d){
		x=b;
		b=d;
		d=x;
	}
	if(b<c){
		x=b;
		b=c;
		c=x;
	}
	if(c<d){
		x=c;
		c=d;
		d=x;
	}
	System.out.println("�Ӵ�С��˳��");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
