package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月23日 下午7:13:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("大黄");
		System.out.println(dog.name);
		dog.breed = "土狗";
		System.out.println("品种："+dog.breed);
		dog.color="黄色";
		System.out.println(dog.color);
		dog.setAge(2);
		System.out.println(dog.getAge());
		dog.getEat();
		dog.getCry();
		
		Mouse mouse = new Mouse();
		mouse.name = "鼠";
		System.out.println("名字："+mouse.name);
		mouse.breed = "家鼠";
		System.out.println("品种："+mouse.breed);
		mouse.legs = 4;
		System.out.println("腿数："+mouse.legs);
	    mouse.getEat();
	    mouse.getCry();
		System.out.println("体重："+mouse.getWeight());
		
		
		
	}

}
