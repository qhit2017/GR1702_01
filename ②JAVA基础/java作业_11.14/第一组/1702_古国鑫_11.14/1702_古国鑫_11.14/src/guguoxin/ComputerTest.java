package guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月14日 下午9:00:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ComputerTest {

	public static void main(String[] args) {
		
		Computer a = new Computer("联想",6000,"笔记本电脑");
		
		System.out.println("该商品的品牌是："+a.name);
		System.out.println("该商品的价格是："+a.price);
		System.out.println("该商品的类型是："+a.category);
	}
}
