package chenjunyi;

import java.util.Scanner;

//�Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳���������
public class Six {
public static void main(String[] args) {
			System.out.println("������");
			Scanner sc = new Scanner(System.in);
			System.out.println("�������1����");
			int a =sc.nextInt();
			System.out.println("�������2����");
			int b =sc.nextInt();
			System.out.println("�������3����");
			int c =sc.nextInt();
			System.out.println("�������4����");
			int d=sc.nextInt();
			int f;
			if(a>b){
				f=a;
				a=b;
				b=f;
			}
			if(a>c){
				f=a;
				a=c;
				c=f;
			}
			if(a>d){
				f=a;
				a=d;
				d=f;
			}
			if(b>c){
				f=b;
				b=c;
				c=f;
			}
			if(b>d){
				f=b;
				b=d;
				d=f;
			}
			if(c>d){
				f=c;
				c=d;
				d=f;
			}
			System.out.println("�Ӵ�С��˳���������:"+d+">"+c+">"+b+">"+a);
}		
}
