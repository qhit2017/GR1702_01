/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺16 Nov 2017 9:23:42 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Ball {
//5  һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
  //  �����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
	
	public static void main(String[] args) {
		double h=100;
		double hn=h*0.5;
		int i=0;
		for(i=2; i<=10;i++){
			h=h+hn*2;
			hn=hn*0.5;
		}
		System.out.println("��"+i+"����ؾ���"+h+"��");
		System.out.println("��"+i+"�η���"+hn+"��");
		
		
		
		
		
		
		
		 
}
}