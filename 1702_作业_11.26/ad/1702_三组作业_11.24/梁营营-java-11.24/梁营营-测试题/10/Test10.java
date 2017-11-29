package com.test;



public class Test10 {

	public static void main(String[] args) {
		
		for (int i =1900; i <=2017; i++) {
			if(((i%4==0)&&(i%100!=0))||(i%400==0)){
				System.out.println("1900~2017ÈòÄêÓÐ£º"+i);
		}
			
			}
		}
	}


