package com.kong.qinghua;
/** 
 * @author  ���� E-mail:1299394372@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:07:41 
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
		}System.out.println("1~100���ۼ�ֵ:"+a);
	}

}
