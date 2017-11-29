package com.zk;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午6:53:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {
	
	//编写JAVA程序，输出所有10000以内个位数为6且同时能被3整除的整数。
	
	public static void main(String[] args) {
		
		for(int a=1;a<=10000;a++){
			
			if(a%10==6 &&a%3==0){
				
				System.out.println(a);
			}
		}
	}

}
