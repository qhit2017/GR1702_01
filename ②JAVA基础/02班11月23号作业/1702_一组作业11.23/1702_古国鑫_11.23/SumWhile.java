package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��23�� ����7:24:22 
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
