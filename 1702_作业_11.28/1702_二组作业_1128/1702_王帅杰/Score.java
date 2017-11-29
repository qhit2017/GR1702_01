package com.qhit;

public interface Score {
	// ����ʮ���˵ĳɼ�
	public static final int NUMBER = 10;

	// ��֪�û���ô�����ϵͳ
	void help();

	// ������Ϣ
	void info(int[] a);

	// ��ƽ��ֵ
	int getAverage(int[] a);

	// �ܷ�
	int getSum(int[] a);

	// ���ֵ
	int getMax(int[] a);

	// ��Сֵ
	int getMin(int[] a);

	// ����������
	int getNot60(int[] a);

	// ��������
	int[] sort(int[] a);

}
