package Liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月16日 上午8:14:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test_4 {
	//4  创建一个测试类，实例化一个警犬对象，
	
	public static void main(String[] args) {
		//实例化对象

		Police_dog dog = new Police_dog();
		//设置警犬品种毛的颜色、重量、年龄、
		//眼睛颜色、腿的数量、最快时速，
		dog.setBreed("马犬");
		System.out.println("狗的品种:"+dog.getBreed());
		dog.setColor("黄色");
		System.out.println("狗毛的颜色："+dog.getColor());
		dog.setAge(2);
		System.out.println("狗的年龄："+dog.getAge());
		dog.setWeight("40千克");
		System.out.println("狗的重量："+dog.getWeight());
		dog.speed ="20千米每小时";
		System.out.println("狗的最快时速："+dog.speed);
		dog.eyecolor ="黑色";
		System.out.println("狗眼睛的颜色："+dog.eyecolor);
		dog.legs =4;
		System.out.println("狗腿的数量："+dog.legs);
		
		//调用它的吃的方法和work方法
		dog.eat();
		dog.work();
		

		
		
		
	}
}
