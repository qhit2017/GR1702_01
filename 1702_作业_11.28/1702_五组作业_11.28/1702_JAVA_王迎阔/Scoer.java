package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Scoer {

	public static final int NUMBER =10;
	//��֪�û���ôʹ�����ϵͳ
	void help();
	//������Ϣ
	void info(int []a);
	//��ƽ����
	int getAverage(int[]a);
	//���ܷ�
	int getsum(int[]a);
	//�����ֵ
	int getMax(int[]a);
	//����Сֵ
	int getmin(int[]a);
	//�󲻼�������
	int getNot60(int[]a);
	//��������
	int[] sort(int[] a);
}
