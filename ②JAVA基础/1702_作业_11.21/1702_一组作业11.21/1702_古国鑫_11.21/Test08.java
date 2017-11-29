package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午4:34:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {

	//编写JAVA程序，求个位数为6且能被3整除的3位整数共有多少。
	public static void main(String[] args) {
		
		int count = 0;
		
		
		for(int a = 100;a < 1000;a++){
			
			if(a % 10 == 6 && a % 3 == 0){
				
				count = count + 1;
				
			}
		}
		System.out.println("共有" + count + "个");
	}
}
