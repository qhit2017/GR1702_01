package com.zk;
/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����6:47:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test07 {
	
	//��дJAVA������1000���ڣ����ܱ�5������
	//ͬʱ���ܱ�10��������������������ӡ������(ʹ��whileѭ��ʵ��)
	
	public static void main(String[] args) {
		
		int a =1;
		while(a<=1000){
			
			if(a%5==0 && a%10!=0){
				
				System.out.println(a);
				
			}
			
			a++;
		}
	}

}
