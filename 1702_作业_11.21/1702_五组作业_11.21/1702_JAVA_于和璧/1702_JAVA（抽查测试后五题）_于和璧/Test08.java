package com.qhit;

public class Test08 {
	//编写JAVA程序，求个位数为6且能被3整除的3位整数共有多少
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a=106;a<1000;a++){
			
			if((a%10==6) && (a%3==0)){
				
				sum =sum+1;
				
			}
		}
		System.out.println("个位数为6且能被3整除的3位整数共有:"+sum+"个！");
	}
}
