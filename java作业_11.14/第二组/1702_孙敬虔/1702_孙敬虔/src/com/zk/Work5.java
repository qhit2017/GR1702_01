package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��14�� ����5:42:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work5 {
	public static void main(String[] args){
		System.out.println("������1��100���ۼ�ֵ��������λΪ3����");
		int sum = 0;
		for(int a = 1;a <= 100;a++){
			if(a % 10 != 3){
				sum += a;
			}
		}
		System.out.println("�͵�ֵΪ��"+sum);
	}

}
