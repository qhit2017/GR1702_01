package com.qhit;

public class Test06 {
	//编写JAVA程序，1至10之间的整数相加，得到累加值大于20的当前数字，将该数字输出
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a=1;a<=10;a++){
			
			sum+=a;
			
			if(sum>20){
				
				System.out.println("该数字为："+a);
				
				break;
			}
			
		}
	}

}
