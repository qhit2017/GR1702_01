package com.qhit;

public class Summation {
	
	//编写程序求 1+3+5+7+……+99 的和值。
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			
			if(i%2!=0){
				
				sum +=i;
			}
			
		}
		System.out.println("1+3+5+7+……+99 的和为:"+sum);
		
	}

}
