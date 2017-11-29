package com.lyl;

public class Sum_1 {
	public static void main(String[] args) {
	  int sum = 0;
		for (int i = 1; i <=100; i++) {
			if (i%2!=0) {
				sum = sum +i;
			}
			
		}
		System.out.println(sum);
		//while ½á¹¹
		int a = 0;
		int m = 0;
		while (a<=100) {
			if (a%2!=0) {
				
				m=m+a;
			}
			a++;
		}
		System.out.println(m);
	}
	
}
