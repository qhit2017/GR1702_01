package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:28:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Four {

	public static void main(String[] args) {
		
		for (int a = 0; a < 10000; a++) {
			
			if (a < 10 && a % 10 == 3) {
				
				System.out.println(a);
				
			} else if (a > 10 && a < 100 && a / 10 % 10 == 3) {
				
				System.out.println(a);
				
			} else if (a > 100 && a < 1000 && a / 100 == 3) {
				
				System.out.println(a);
				
			} else if (a > 1000 && a < 10000 && a / 1000 == 3) {
				
				System.out.println(a);
			}
		}
	}
}
