package com.zk.smc;

public interface score {
	public static final int NUMBER = 10;

	void help();

	void Info(int[] a);// ��Ϣ

	int getSum(int[] a);// ���

	int getAverage(int[] a);// ��ƽ��ֵ

	int getMax(int[] a);// �����ֵ

	int getMin(int[] a);// ����Сֵ

	int getNot60(int[] a);// ����������

	int[] sort(int[] a);// ��������

}
