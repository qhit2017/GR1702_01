package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:36:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int a = 0;a<1000;a++){
			if(a%8==0){
				count++;
			}
		}
		System.out.println("1000����8�ı�����"+count+"��");

	}
}
