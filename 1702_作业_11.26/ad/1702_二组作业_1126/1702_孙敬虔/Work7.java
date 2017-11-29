package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午1:22:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work7 {
	public static void main(String[] args) {
		int a=0;
		while (a<=1000) {
			if(a%5==0&&a%10!=0){
				System.out.println(a);	
			}
			a++;
		}
	}

}
