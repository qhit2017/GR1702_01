package com.zk.qhit.statictest;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("�������һ������");
		 int x=Sc.nextInt();
		 System.out.println("������ڶ�������");
		 int y=Sc.nextInt();
		 System.out.println("���������������");
		 int z=Sc.nextInt();
		 
		 int f;
		 
		 if(x>y){
			 f=x;
			 x=y;
			 y=f;
			 }
		 if(x>z){
			 f=x;
			 x=z;
			 z=f;
			 }
		 if(y>z){
			 f=y;
			 y=z;
			 z=f;
			 }
		 if(x>z){
			 f=x;
			 x=z;
			 z=f;
			 }
		 System.out.println("��С������:"+x+"<"+y+"<"+z);
	}
}
