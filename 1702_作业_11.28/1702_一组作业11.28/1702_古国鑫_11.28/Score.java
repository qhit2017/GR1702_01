package com.ggx;

public interface Score {

	public static final int NUMBER=10;
	
	//����
	void help();
	
	//����
	void info(int[] a);
	
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
	
	//����
	int[] sort(int[] a);

}
