package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月23日 下午7:13:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SumFor {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 != 0) {
				
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
