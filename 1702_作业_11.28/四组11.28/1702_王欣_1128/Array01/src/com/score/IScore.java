package com.score;
/*�����ˣ�����
 *����ʱ�䣺2017��11��27������4:22:40
 *���䣺2408368509@qq.com
 */

public interface IScore {
	public static final int NUMBER = 10;
	//�û�����
		void help();
		
		void info(int[]a);
		//��ƽ��ֵ
		int getAverage(int[]a);
		//���ܷ�
		int getSum(int[]a);
		//�����ֵ
		int getMax(int[]a);
		//����Сֵ
		int getMin(int[]a);
		//�󲻼���
		int getNot60(int[]a);
		
		//��������
		
		int[] sort(int[] a);
		
		
	}


