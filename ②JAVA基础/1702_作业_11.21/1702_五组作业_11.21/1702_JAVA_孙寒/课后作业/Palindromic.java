package com.zk.qhit.statictest;

import java.util.Scanner;

public class Palindromic {
	public static void main(String[] args) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("请输入一个五位数");
		 int a=Sc.nextInt();
		 if(a>=10000&&a<=99999){
			 
			 if(a/10000==a%10&&a%10000/1000==a%100/10){
				 System.out.println("这个数是回文数");
			 }else{
				 System.out.println("这个数不是回文数"); 
			 }
		 }
		 
	}

}
