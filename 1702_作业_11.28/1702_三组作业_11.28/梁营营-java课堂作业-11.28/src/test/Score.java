package test;

public interface Score {

	public static final int NUMBER = 15;

	// ������
	void help();

	// ���гɼ���
	void Info(int[] a);

	// ƽ��ֵ��
	int getAverage(int[] a);

	// �ܷ֣�
	int getSum(int[] a);

	// ���ֵ��
	int getMax(int[] a);

	// ��Сֵ��
	int getMin(int[] a);

	// ������
	int getNot60(int[] a);

	// ����
	int[] Sort(int[] a);
}
