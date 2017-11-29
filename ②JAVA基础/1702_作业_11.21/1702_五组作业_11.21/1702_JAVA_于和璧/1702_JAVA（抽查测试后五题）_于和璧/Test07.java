package com.qhit;

public class Test07 {
	//编写JAVA程序，从1.2.3.4.5这五个数任意取出两个数，列出他们的所有组合并输出到屏幕上
	public static void main(String[] args) {
		
		System.out.println("所有的组合为：");
		
		for(int a=1;a<=5;a++){
			
			for(int b=1;b<=5;b++){
				
				if(a==b){
					
					continue;
				}
				
				System.out.print(a);
				System.out.println(b);
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
