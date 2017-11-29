package Commodity;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月14日 下午4:45:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class test {
//第三种 五个参数
	int number;
	String name;
	int price;
	char type;
	String sort;
	test(int numbers,String names,int prices,
			char typeS,String sorts){
		number =numbers;
		name =names;
		price =prices;
		type =typeS;
		sort =sorts;
	}
	public static void main(String[] args) {
		test s =new test(10,"笔记本",10,'t',"文具类");
			System.out.println("商品编号："+s.number);
			System.out.println("名称："+s.name);
			System.out.println("价格"+s.price);
			System.out.println("型号："+s.type);
			System.out.println("类别："+s.sort);
	}
}
	




