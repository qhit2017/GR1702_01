package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����4:34:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {

	//��дJAVA�������λ��Ϊ6���ܱ�3������3λ�������ж��١�
	public static void main(String[] args) {
		
		int count = 0;
		
		
		for(int a = 100;a < 1000;a++){
			
			if(a % 10 == 6 && a % 3 == 0){
				
				count = count + 1;
				
			}
		}
		System.out.println("����" + count + "��");
	}
}
