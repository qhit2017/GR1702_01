package com.ad;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:23:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface INum {

	
	void help();  //����
	int max(int[] a);  //���ֵ
	int min(int[] a);  //��Сֵ
	int sum(int[] a);  //���
	int average(int[] a);  //ƽ��ֵ
	String info(int[] a);  //����Ԫ��
	void less60(int[] a);  //С��60��Ԫ��
	String sort(int[] a);  //��������
	
}
