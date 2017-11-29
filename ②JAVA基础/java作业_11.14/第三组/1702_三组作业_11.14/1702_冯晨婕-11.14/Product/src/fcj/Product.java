/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：14 Nov 2017 5:56:56 Ntambama
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
public class Product {
//构造方法
	String id;
	String  name;
	double price;
	String model;
	String category;
	//无参
	Product(){
	System.out.println("我是无参");}
	
	//三参
	Product(String ids,String  names,double prices){
	id=ids;
	name=names;
	price=prices;}
	
	//五参
	Product(String ids,String  names,double prices,String models,String categorys){
		id=ids;
		name=names;
		price=prices;
		model=models;
		category=categorys;
		
}
}