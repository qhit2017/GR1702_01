package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��18�� ����1:47:09 
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
		System.out.println("1000����8�ı����ĺ�Ϊ��"+sum);
		
	}

}
