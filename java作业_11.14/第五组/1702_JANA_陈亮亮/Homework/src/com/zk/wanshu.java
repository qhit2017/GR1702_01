package com.zk;

/**
 * 制作者：陈亮亮 制作时间：2017年11月14日下午6:35:14 邮箱：2507147605@qq.com
 */
public class wanshu {
	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			int sum = 0;
			for (int i = 1; i < a; i++) {

				if (a % i == 0) {
					 sum +=i;	
				}
				
				
				
			}if(sum==a){
				System.out.println(a+"\t");
			}
		}
	}

}
