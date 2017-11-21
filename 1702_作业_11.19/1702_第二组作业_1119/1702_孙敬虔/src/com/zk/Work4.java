package com.zk;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月18日 下午1:47:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work4 {
	public static void main(String[] args) {
		int a;
		int sum=0;
		for(a=8;a<=1000;a++){
			if(a%8==0){
				sum=sum+a;
			}
			a++;
		}
		System.out.println("1000以内8的倍数的和为："+sum);
		
	}

}
