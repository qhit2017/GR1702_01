
package com.qhit.score;
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:22:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {

	public static final int NUMBER = 10;
	
	public void help();
	//ƽ����
	int getAverage(int[] a);
	
	//�ܷ�
	int getSum(int[] a);
	
	//���ֵ
	int getMax(int[] a);
	
	//��Сֵ
	int getMin(int[] a);
	
	//������
	int getNot60(int[] a);
	
	//������Ϣ
	void  info(int[] a);
	
	//��������
	int[] sort(int[] a);
	
	
	
	
	
	
	
	
	
	
	
	
}
