package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:14:07 
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
