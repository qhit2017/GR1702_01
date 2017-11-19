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
public class Test {
	public static void main(String[] args) {
		
     //创建一个测试类，
	//实例化一个警犬对象，
	//设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
	//调用它的吃的方法和work方法
	PolicDog policdog=new PolicDog("牧羊犬", "黑色", 18, 50, "紫色", 4,"10公里");
	policdog.setVariety("牧羊犬");
	System.out.println("牧羊犬");
	policdog.setColor("黑色");
	System.out.println("黑色");
	policdog.setAge(18);
	System.out.println(18);
	policdog.setWeight(50);
	System.out.println(50);
	policdog.eyecolor="紫色";
	System.out.println("紫色");
	policdog.leg=4;
	System.out.println(4);
	policdog.thefastestspeed="10公里";
	System.out.println("10公里");
		
	policdog.eat();
	policdog.work();
}
	
}
