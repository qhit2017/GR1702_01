package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月13日 下午8:34:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Product {
	//创建五个属性
	int id;//编码
	String name;//名称
	int price;//价格
	String model;//型号
	String sort;//类别
	
	//不带参数的
	public Product(){
		
	}
	//带三个参数的
	public Product(int id,String name,int price){
		this.id = id;
		this.name =name;
		this.price = price;
		System.out.println("编号："+id+"\t名称："+name+"\t价格："+price);
		
	} 
	//带五个参数的
	public Product(int id,String name,int price,String model,String sort){
		this.id = id;
		this.name =name;
		this.price = price;
		this.model = model;
		this.sort = sort;
	}
	
	
	

}
