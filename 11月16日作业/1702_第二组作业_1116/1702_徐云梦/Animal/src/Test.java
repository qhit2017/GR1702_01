/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月16日 上午8:44:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Police dog =new Police();
		
		dog.breed="拉布拉多犬";
		dog.setColor("黄色");
		dog.weight=30;
		dog.age=2;
		dog.eyecolor="棕色";
		dog.number=4;
		dog.speed=("30km/h");
		
		System.out.println("狗的品种是 "+dog.breed+"\n"
		+"毛的颜色是 "+dog.setColor()+"\n"+"狗的体重是 "+dog.weight+"\n"
		+"狗的年龄是 "+dog.age+"\n"+"狗眼睛的颜色是 "+dog.eyecolor+"\n"
		+"狗腿的数量 "+dog.number+"\n"+"狗的时速是 "+dog.speed+"\n"	);	
		
		dog.eat();
		dog.work();
	}
}
