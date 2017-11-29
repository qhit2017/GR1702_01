package com.zk;

public class Test04 {
	
	//请输出0~10000之间以3开头的数
	
	public static void main(String[] args) {
		
		for(int a =0;a<=10000;a++){
			
			if(a/10==3  || a/3==1){
				
				System.out.println(a);
			}
			
			if(a/100==3){
				
				System.out.println(a);
			}
			
			if(a/1000==3){
				
				System.out.println(a);
			}
		}
	}

}
