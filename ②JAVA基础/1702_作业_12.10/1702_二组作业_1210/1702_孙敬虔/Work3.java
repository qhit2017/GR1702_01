package com.hashnap.zk;

public class Work3 {
	public static void main(String[] args) {
		
		for (int i =101; i <200; i++) {
			for (int j = 2; j < i/2; j++) {
				if (i%j==0) {
					break;
				}
				if (j==i/2-1) {
					System.out.println(i);
					
					
				}
			}
		}
		
		
	}

}
