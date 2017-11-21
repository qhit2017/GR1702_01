package com;

public class ExactDivision {
public static void main(String[] args) {
	/**
	 * 编写Java程序，求1000以内，即能被3整除又能被5整除
	 * 的所有数
	 */
	int a = 1;
	do{if(a%5==0&&a%3==0){
		System.out.println(a);
		}
		a++;
		}while(a<=1000);
}
}