package com.zk;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��14������6:35:14 ���䣺2507147605@qq.com
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
