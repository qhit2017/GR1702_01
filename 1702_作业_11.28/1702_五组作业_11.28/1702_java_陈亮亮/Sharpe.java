package Sqare;
/**�����ߣ�������
 *����ʱ�䣺2017��11��27������4:27:00
 *���䣺2507147605@qq.com
 */
public interface Sharpe  {
public static final int NUMBER =10;
//���ݹ���
 default void help() {
	// TODO Auto-generated method stub
	
}
//��ƽ��ֵ
int getAverage(int[]a);
//���ܷ�
int getsum(int[]a);
//����Сֵ
int getMin(int[]a);
//�����ֵ
int getMax(int[]a);
//�󲻼�������
int getNot60(int[]a);
//��������

	int[] sort(int[] a);
	//������Ϣ
	void  info(int[] a);
}
