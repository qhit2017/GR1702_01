package com;

public class Test05 {
	
	public static void main(String[] args) {
		//for
		int sum = 0;
		
		for(int a = 1;a<=100;a++){
			if(a%2!=0){
			sum+=a;
			}
		}
		System.out.println(sum);
		
		
		
		
		
		// 第二种算法：while
		int b = 1;
		int c = 0;
		while(b<=100){
			
		
			if(b%2!=0){
				
				c=c+b;	
			}
			b++;
		
		}
		System.out.println(c);
	
	
	
	
	
	}

	
}
