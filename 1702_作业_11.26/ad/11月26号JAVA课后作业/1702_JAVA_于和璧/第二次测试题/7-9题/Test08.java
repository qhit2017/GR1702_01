package com.zk;
/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����6:53:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {
	
	//��дJAVA�����������10000���ڸ�λ��Ϊ6��ͬʱ�ܱ�3������������
	
	public static void main(String[] args) {
		
		for(int a=1;a<=10000;a++){
			
			if(a%10==6 &&a%3==0){
				
				System.out.println(a);
			}
		}
	}

}
