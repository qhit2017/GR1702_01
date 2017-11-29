package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:28:41 
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
