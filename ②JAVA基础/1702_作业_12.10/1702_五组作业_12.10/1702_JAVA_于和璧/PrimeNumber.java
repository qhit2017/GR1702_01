package com.qhit;

public class PrimeNumber {
	
	//判断101-200之间有多少个素数，并输出所有素数。
	public static void main(String[] args) {
		
		boolean isPrimeNumber;
		int sum = 0 ;
		System.out.println("101-200之间的素数为：");
		for (int i =101; i <200; i++) {
			
			isPrimeNumber = true;
			for (int j =2; j <i; j++) {
				
				if (i%j==0) {
					
					isPrimeNumber = false;
					break;
					
				}
				
				}
			
			if (isPrimeNumber) {
				
				sum++;
				
				System.out.println(i+"\t");
				
			}
			
		}System.out.println("101-200之间共有"+sum+"个素数");
		
	}

}
