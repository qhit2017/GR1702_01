package com.zk;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午6:47:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test07 {
	
	//编写JAVA程序，求1000以内，既能被5整除，
	//同时不能被10整除的所有整数，并打印出来。(使用while循环实现)
	
	public static void main(String[] args) {
		
		int a =1;
		while(a<=1000){
			
			if(a%5==0 && a%10!=0){
				
				System.out.println(a);
				
			}
			
			a++;
		}
	}

}
