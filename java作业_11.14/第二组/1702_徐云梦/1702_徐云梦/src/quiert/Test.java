package quiert;



/** 
 * @author  作者: xuyunmeng
 * @date    创建时间：2017年11月14日 下午6:29:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Snack snack = new Snack();
		   snack.model="cool";
		   snack.name="小吃店";
		   snack.price=20;
		   snack.category="多种多样";
		   snack.number=500;
		   
		   //无参数的构造方法
		   Snack New = new Snack();
		   System.out.println(New);
		   
		   //带编号、名称、价格三个参数的
		   Snack To = new Snack("cool","小吃店",20);

		   System.out.println("编号"+To.model);
		   System.out.println("名字"+To.name);
		   System.out.println("价格"+To.price);
		   
		   
		   //五个参数的构造方法
		   Snack Too = new Snack("cool","小吃店",20,"多种多样",500);
		   System.out.println("编号"+Too.model);
		   System.out.println("名字"+Too.name);
		   System.out.println("价格"+Too.price);
		   System.out.println("种类"+Too.category);
		   System.out.println("数量"+Too.number);
		   
		   
	}
}
