package com.zk;
/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����3:38:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {
	
	//��дJAVA������1000��������8�ı����������ж��ٸ��������������
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int a =1;a<=1000;a++){
			
			if(a%8==0){
				
				sum++;
				
			}
		}
		System.out.println("1000��������8�ı�����������:"+sum+"����");

	}

}
