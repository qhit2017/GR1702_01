/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��16�� ����9:26:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ball {
	public static void main(String[] args) {
		
		 //һ���50�׸߶��������¡�����ÿ����غ�����ԭ�߶ȵ�һ�룻
		 // �����£������� ��5�����ʱ�������������ף���n�η�����ߣ�
		double a =50;
		double b =a/2;
		int c= 0;
		  
		for(c=2;c<=10;c++){
			a += b*2;
			b = b/2;
		}
		System.out.println("��"+c+"����ؾ���������"+a+"��");
		System.out.println("��"+c+"�η���������"+b+"��");
		
		
		
	}
	
}
