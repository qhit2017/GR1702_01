package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月14日 下午5:26:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestProduct {

	public static void main(String[] args) {
		//不带参数的 
		Product x = new Product();
		System.out.println(x);
		
		
		System.out.println();
		//三个参数的
		Product a = new Product(5,"加多宝",3);
		
		
		System.out.println();
		//五个参数的
		Product s = new Product(5,"加多宝",3,"罐装","饮料");
		System.out.println("编号："+s.id);
		System.out.println("名称："+s.name);
		System.out.println("价钱："+s.price);
		System.out.println("型号："+s.model);
		System.out.println("类别："+s.sort);
		
		

	}

}
