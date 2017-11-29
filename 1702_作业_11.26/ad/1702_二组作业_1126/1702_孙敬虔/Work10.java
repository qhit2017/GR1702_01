package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午1:59:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work10 {
	public static void main(String[] args) {
		for(int a=1900;a<=2017;a++){
			if((a%4==0&&a%100!=0)||(a%400==0)){
				System.out.println(a);
			}
		}
	}
	

}
