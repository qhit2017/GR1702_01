package com.qhit;

public class Test10 {
	//编写JAVA程序，输出乘法口诀表。（使用while实现）
	public static void main(String[] args) {
		
		int a =1;
		
		while(a<=9){
			
			int b=1;
			
			while(b<=a){
				
				System.out.print(b+"*"+a+"="+b*a+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
		
	}

}
