package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����4:34:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {

	//��дJAVA����1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣��������������
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <=10; i++) {
			sum = sum+i;
			
			if (sum>20) {
				
				System.out.println(i);
				
				break;
				
			}
		}
	}
}
