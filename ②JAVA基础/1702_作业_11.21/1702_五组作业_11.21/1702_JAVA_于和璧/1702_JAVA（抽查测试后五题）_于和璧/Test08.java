package com.qhit;

public class Test08 {
	//��дJAVA�������λ��Ϊ6���ܱ�3������3λ�������ж���
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a=106;a<1000;a++){
			
			if((a%10==6) && (a%3==0)){
				
				sum =sum+1;
				
			}
		}
		System.out.println("��λ��Ϊ6���ܱ�3������3λ��������:"+sum+"����");
	}
}
