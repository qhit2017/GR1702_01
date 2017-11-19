package guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PolicDog extends Dog {
	
	 PolicDog(String variety, String color, double age, double weight,String eyecolor,int leg,String thefastestspeed) {
		super(variety, color, age, weight);
	
	}

// 定义一个类：警犬 并继承第一题的类：狗
    //  属性：最快时速
   //	方法：work
String thefastestspeed;

	void work(){
		System.out.println("工作");
	}
}
