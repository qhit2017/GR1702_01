package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月14日 下午8:56:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {

		Category p = new Category();

		System.out.println(p);
		System.out.println();

		Category a = new Category("007", "笔记本", 11);

		System.out.println(a.getSerial());
		System.out.println(a.name);
		System.out.println(a.price);

		System.out.println();

		Category s = new Category("007", "笔记本", 11, "晨光", "文具");

		System.out.println("该商品的编号是："+s.getSerial());
		System.out.println("该商品的名称是："+s.name);
		System.out.println("该商品的价格是："+s.price);
		System.out.println("该商品的品牌是："+s.model);
		System.out.println("该商品的类别是："+s.category);
	}
}
