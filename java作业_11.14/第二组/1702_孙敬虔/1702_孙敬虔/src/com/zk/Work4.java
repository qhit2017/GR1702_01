package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:37:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work4 {

	public static void main(String[] args) {
		
	for(int a =1;a<=1000;a++){
		int sum=0;
		for(int b =1; b<a; b++){
			if(a%b ==0){
			sum += b;
			}
		}
		if(sum ==a){
			System.out.println(a);
		}
	}
	}
}
