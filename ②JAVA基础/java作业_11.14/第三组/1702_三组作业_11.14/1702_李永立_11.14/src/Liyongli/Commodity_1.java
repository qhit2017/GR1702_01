package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月13日 下午9:38:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Commodity_1 {
	public static void main(String[] args) {
		
	
	Commodity s =new Commodity("12","名称",20.5, "大号", "lei ");
	System.out.println("商品编号："+s.getId());
	System.out.println("商品名称："+s.name);
	System.out.println("商品价格："+s.value);
	System.out.println("商品型号："+s.model);
	System.out.println("商品类型："+s.genre);
	
	}
	
	

}
