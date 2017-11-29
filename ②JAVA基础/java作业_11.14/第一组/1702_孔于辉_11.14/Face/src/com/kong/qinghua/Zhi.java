package com.kong.qinghua;
/** 
 * @author  作者 E-mail:1299394372@qq.com
 * @date    创建时间：2017年11月14日 下午8:07:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zhi {
	public static void main(String[] args) {
		int a = 0;
		for(int b = 1;b<=100;b++){
			if(!(b%10==3)){
				a=a+b;
				
			}
		}System.out.println("1~100的累加值:"+a);
	}

}
