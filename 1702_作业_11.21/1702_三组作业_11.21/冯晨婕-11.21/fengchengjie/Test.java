/**
 * 
 */
package fengchengjie;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺21 Nov 2017 7:24:40 Ntambama
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
	Student a=new Student(18, "�볿�");
	System.out.println(a.getContent());
	System.out.println("������"+a.name);
	System.out.println("���䣺"+a.age);
	
	Worker b = new Worker(25, "����");
	System.out.println(b.getContent());
	System.out.println("������"+b.name);
	System.out.println("���䣺"+b.age);
	 
	
	
}
}
