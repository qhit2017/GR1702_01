/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：14 Nov 2017 6:13:53 Ntambama
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

	
		Product p2=new Product("007","笔记本",23.23);
	System.out.println("商品名称"+p2.name);
	System.out.println("商品编号"+p2.id);
	System.out.println("商品价格"+p2.price);
	
	
	Product p3=new Product("007","笔记本",23.23,"类型","A");
	System.out.println("商品名称"+p3.name);
	System.out.println("商品编号"+p3.id);
	System.out.println("商品价格"+p3.price);
	System.out.println("商品类型"+p3.model);
	System.out.println("商品种类"+p3.category);
	
	
	
}
}
