package com.zk;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月16日 下午8:57:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work5 {
	public static void main(String[] args) {
		
		double sum =100;
		double h = sum/2;
		
		for (int a =1; a<=10;a++){
			sum += h*2;
			h = h/2;
		}
		System.out.println(sum);
		System.out.println(h);
	}

}
