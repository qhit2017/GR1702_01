package Com.score;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {
	public static final int NUMER=10;
	//��֪�û���ôʹ�����ϵͳ��
	
	void help();
	
	//������Ϣ��
	
	void info(int[] a);
	
	//��ƽ��ֵ��
	
	int getaverage(int [] a);
	
	//���ܷ֡�
	
	int getsum(int [] a);
	
	//�����ֵ��
	
	int getmax(int [] a);
	
	//����Сֵ��
	
	int getmin(int [] a);
	
	//�󲻼���������
	
	int getnot60(int [] a);
	
	//��������
	
	int[] sort(int[] a);
}
