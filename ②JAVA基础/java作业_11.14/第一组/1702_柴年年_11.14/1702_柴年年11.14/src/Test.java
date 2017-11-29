
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月14日 上午7:56:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("带有三个参数");
		Commodity men = new Commodity("001","小明1",45.5);
			System.out.println("名称:"+men.name);
			System.out.println("编号:"+men.number);
			System.out.println("价格:"+men.price);
			System.out.println("型号:"+men.model);
			System.out.println("类别:"+men.category);
			System.out.println("带有五个参数");
		Commodity you = new Commodity("002","小明2",56.3,"jd-A","S");
			System.out.println("名称:"+you.name1);
			System.out.println("编号:"+you.number1);
			System.out.println("价格:"+you.price1);
			System.out.println("型号:"+you.model1);
			System.out.println("类别:"+you.category1);
			System.out.println("不带参数");
			System.out.println(men);
	}
}
