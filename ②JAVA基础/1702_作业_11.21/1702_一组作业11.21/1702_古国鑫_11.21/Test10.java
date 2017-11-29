package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午4:35:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test10 {

	//编写JAVA程序，输出乘法口诀表。（使用while实现）
	public static void main(String[] args) {
		
		int i =1;
		
		while(i<10){
			
			int j =1;
			
				while(j<=i){
					
					System.out.print(j + "*" + i + "=" + i*j + "\t");
					
					j++;
				}
				
			System.out.println();
			
				i++;
		}
	}
}
