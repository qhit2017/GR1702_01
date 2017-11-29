package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:36:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int a = 0;a<1000;a++){
			if(a%8==0){
				count++;
			}
		}
		System.out.println("1000以内8的倍数有"+count+"个");

	}
}
