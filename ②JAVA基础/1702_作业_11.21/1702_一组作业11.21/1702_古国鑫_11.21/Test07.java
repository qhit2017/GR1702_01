package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午4:34:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test07 {

	//编写JAVA程序，从1.2.3.4.5这五个数任意取出两个数，列出他们的所有组合并输出到屏幕上。
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				if (i==j) {
					
					continue;
				}
				System.out.println(i+""+j);
			}
		}
	}
}
			
	

