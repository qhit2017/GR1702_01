/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 8:45:35 Ntambama
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
//创建测试类，分别创建正方形和梯形的实例化对象
	//，给对象的属性赋值，并且调用对象的周长、面积的方法
	 
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
