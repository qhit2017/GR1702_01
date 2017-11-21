/**
 * 
 */
package com.zk.qhit;

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月21日 下午5:03:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
	public static void main(String[] args) {
	int a = 0;
	for (int i = 100; i < 1000; i++) {
		if(i%10==6 && i%3==0){
			
			a++;
		}
		
	}
	System.out.println("个位数上为6且能被3整除的数的个数为 ："+a+"个");
	}
	
}
