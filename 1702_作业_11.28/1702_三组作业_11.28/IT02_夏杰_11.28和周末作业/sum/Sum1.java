package com.sum;
/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 上午9:29:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Sum1 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 1; a<=100;a++){
			if(a%2!=0){
				sum += a;
			}
			
		}
		System.out.println(sum);
	}
	

}
