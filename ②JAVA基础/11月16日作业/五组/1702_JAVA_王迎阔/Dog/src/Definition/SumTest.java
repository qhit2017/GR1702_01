package Definition;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:25:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class SumTest {
	public static void main(String[] args) {
		// һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		// �����£������� ��10�����ʱ�������������ף���10�η�����ߣ�

		int a=100;//��ʼ�߶�
		
		
		int b=10;//��ش���
		int c=2;//�ڶ��η���
		double r=a;  //��������
		double hei=a/2;  //n�εķ����߶�

		while(b>1&&c<=b){
			r=r+hei*2;
			hei=hei/2;
			c++;
		}
		System.out.println("������"+r+"�ף�");
		System.out.println("�����߶�Ϊ��"+hei+"�ף�");
		
	}

}
