package com.sum;
/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 上午8:54:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Sum {
	
	public static void main(String[] args) {
		int a = 1 ;
		int sum = 0;
		while(a<=100){
			if(a%2!=0){
				sum += a;
				
			}
			a++;
		}
		System.out.println(sum);
	}

}
