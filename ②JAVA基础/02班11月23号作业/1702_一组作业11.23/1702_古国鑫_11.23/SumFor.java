package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��23�� ����7:13:02 
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
