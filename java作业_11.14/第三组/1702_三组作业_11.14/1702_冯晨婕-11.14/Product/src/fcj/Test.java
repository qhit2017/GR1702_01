/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺14 Nov 2017 6:13:53 Ntambama
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
		Product p1=new Product();

	
		Product p2=new Product("007","�ʼǱ�",23.23);
	System.out.println("��Ʒ����"+p2.name);
	System.out.println("��Ʒ���"+p2.id);
	System.out.println("��Ʒ�۸�"+p2.price);
	
	
	Product p3=new Product("007","�ʼǱ�",23.23,"����","A");
	System.out.println("��Ʒ����"+p3.name);
	System.out.println("��Ʒ���"+p3.id);
	System.out.println("��Ʒ�۸�"+p3.price);
	System.out.println("��Ʒ����"+p3.model);
	System.out.println("��Ʒ����"+p3.category);
	
	
	
}
}
