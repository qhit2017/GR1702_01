package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月26日 下午8:14:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Three {
	public static void main(String[] args) {
		for (int i = 3; i <=10000; i++) {
			if(i/1000==3||i/100==3||i/10==3||i/1==3){
				System.out.println(i);
			}
		}
	}

}
