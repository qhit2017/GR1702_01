/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 8:45:35 Ntambama
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
public class Test {
//���������࣬�ֱ𴴽������κ����ε�ʵ��������
	//������������Ը�ֵ�����ҵ��ö�����ܳ�������ķ���
	 
		static void test(Square s){
		s.girth();
		s.area();}
		static void test ( Trapezoid t){
			t.girth();
			t.area();}
	 public static void main(String[] args) {
		 Square s=new  Square();
		 test (s);
		 
		 Trapezoid t=new  Trapezoid ();
		 test (t);
		
		
		
		
		
		
	}
}
