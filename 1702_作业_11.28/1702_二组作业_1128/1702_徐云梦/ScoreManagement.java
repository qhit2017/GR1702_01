/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��27�� ����4:23:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface ScoreManagement {
	// ����ʮ���˵ĳɼ�
	int NUMBER = 10;

	// ����
	void help();

	// ������Ϣ
	void info(int[] a);

	// ��ƽ��ֵ
	int getAverage(int[] a);

	// ���ܷ�
	int getSum(int[] a);

	// �����ֵ
	int getMax(int[] a);

	// ����Сֵ
	int getMin(int[] a);

	// �󲻼�������
	int getNot(int[] a);

	// ��������
	int[] sort(int[] a);

}
