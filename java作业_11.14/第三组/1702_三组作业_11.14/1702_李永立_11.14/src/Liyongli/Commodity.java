package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月13日 下午8:18:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Commodity {
	//属性
	//构造商品编号，名称，价格，型号，类别 五个属性
	 private  String  id;
	String name;
	double  value;
	String model;
	String genre ;
	 Commodity(String ids, String names, double values,String models, String genres ){
		 id =ids;
		 name =names;
		 value =values;
		 model =models;
		 genre =genres;
		System.out.println("我是一个无参构造方法，正在为你构造参数");
		
	}
	//设置
		void setId(String ids){
			if (ids.equals("000")){
				System.out.println("不能以此id 作为商品id");
			}else{
				id =ids;
			}
		}
		//获取
		String getId(){
			return id;
		}
	
	
	
	
	

}
