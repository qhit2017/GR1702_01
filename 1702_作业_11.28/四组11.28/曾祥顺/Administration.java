/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��27�� ����4:35:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Administration {

	static int a = 10;
	
	//����
	 void help();
	
	//���
	int sum(int[] a);
	
	//ƽ��ֵ
	int Average(int[] a);
	
	//��������
	int[] sort(int[] a);
	
	
	//������Ϣ
	void  info(int[] a);
	
	//����������
	int getNot60(int[] a);
		
}
