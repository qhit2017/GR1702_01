package Grade;

public interface Grade {
	
	public static final int NUMBER =10;
	
	void help();
	
	void info(int[] a);
	
	//���
	int getSum (int[] a);
	
	//�����ֵ
	int getMax (int[] a);
	
	//����Сֵ
	int getMin (int[] a);
	
	//�󲻼�������
	int getNot(int[] a);
	
	//��ƽ��ֵ
	int getMean(int[] a);
	
	
	int[]  Sort(int[] a);

}
