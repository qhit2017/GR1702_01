import java.util.Scanner;

 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:53:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ball {

	/*һ���100�׸߶��������£�
	 * ÿ����غ�����ԭ�߶ȵ�һ�룻
	 * �����£������� ��10�����ʱ��
     * �����������ף���10�η�����ߣ�
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������߶�");
		double h = sc.nextInt();
		System.out.println("���������");
		int n =sc.nextInt();
		double hn =h/2;
		int i =0;
		for(i=2;i<n;i++){
			h=h+hn*2;
			hn =hn/2;
		}
		System.out.println("��"+i+"����ؾ���"+h+"��");
		System.out.println("��"+i+"�η���"+hn+"��");
		
		
		
		
		
		
		
		
	}
}
