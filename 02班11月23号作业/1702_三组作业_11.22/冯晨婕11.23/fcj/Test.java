/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺23 Nov 2017 6:57:28 Ntambama
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
public static void main(String[] args) {
	//
	  // d.���������࣬�ֱ𴴽����������ʵ��������
	   //����������Ը�ֵ�����ҵ��ö���ĳԡ��еķ���
	Dog d  =new Dog();
  d.setName("dog");
	d.setBreed("����Ȯ");
	d.setAge(3);
	d.setColor("��");
	System.out.println(d.getEat());
	System.out.println(d.getCall());
	
	//mouse
	Mouse m =new Mouse();
	m.setName("mouse");
    m.setBreed("С����");
	m.setLegs(4);
	m.setWeight(50.8);
	System.out.println(m.getEat());
	System.out.println(m.getCall());
	
	
	
}
}
