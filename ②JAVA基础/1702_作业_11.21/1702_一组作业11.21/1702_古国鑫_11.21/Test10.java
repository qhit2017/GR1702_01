package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����4:35:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test10 {

	//��дJAVA��������˷��ھ�����ʹ��whileʵ�֣�
	public static void main(String[] args) {
		
		int i =1;
		
		while(i<10){
			
			int j =1;
			
				while(j<=i){
					
					System.out.print(j + "*" + i + "=" + i*j + "\t");
					
					j++;
				}
				
			System.out.println();
			
				i++;
		}
	}
}
