package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����4:34:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test07 {

	//��дJAVA���򣬴�1.2.3.4.5�����������ȡ�����������г����ǵ�������ϲ��������Ļ�ϡ�
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				if (i==j) {
					
					continue;
				}
				System.out.println(i+""+j);
			}
		}
	}
}
			
	

