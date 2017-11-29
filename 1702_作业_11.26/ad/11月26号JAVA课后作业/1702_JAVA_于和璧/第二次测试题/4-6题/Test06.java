package com.zk;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午3:38:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {
	
	//编写JAVA程序，求1000以内所有8的倍数的数字有多少个，请输出个数。
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int a =1;a<=1000;a++){
			
			if(a%8==0){
				
				sum++;
				
			}
		}
		System.out.println("1000以内所有8的倍数的数字有:"+sum+"个！");

	}

}
