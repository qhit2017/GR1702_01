package com.zk.qhit.statictest;

import java.util.Scanner;

public class Palindromic {
	public static void main(String[] args) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("������һ����λ��");
		 int a=Sc.nextInt();
		 if(a>=10000&&a<=99999){
			 
			 if(a/10000==a%10&&a%10000/1000==a%100/10){
				 System.out.println("������ǻ�����");
			 }else{
				 System.out.println("��������ǻ�����"); 
			 }
		 }
		 
	}

}
