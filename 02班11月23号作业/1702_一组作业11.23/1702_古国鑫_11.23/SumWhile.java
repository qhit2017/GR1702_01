package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月23日 下午7:24:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SumWhile {

	public static void main(String[] args) {
		
		int i = 1;
		
		int sum = 0;
		
		while (i <= 100) {
			
			if (i % 2 != 0) {
				
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
