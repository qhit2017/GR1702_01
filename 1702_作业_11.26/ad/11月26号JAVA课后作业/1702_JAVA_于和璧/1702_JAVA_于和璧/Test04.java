package com.zk;

public class Test04 {
	
	//�����0~10000֮����3��ͷ����
	
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
