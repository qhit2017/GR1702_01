package com.kyh;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int a = 0;a<1000;a++){
			if(a%8==0){
				count++;
			}
		}
		System.out.println("1000以内8的倍数有"+count+"个");

	}
}
