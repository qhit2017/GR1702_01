/**
 * 
 */
package com.zk.qhit;

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��21�� ����5:03:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
	public static void main(String[] args) {
	int a = 0;
	for (int i = 100; i < 1000; i++) {
		if(i%10==6 && i%3==0){
			
			a++;
		}
		
	}
	System.out.println("��λ����Ϊ6���ܱ�3���������ĸ���Ϊ ��"+a+"��");
	}
	
}
