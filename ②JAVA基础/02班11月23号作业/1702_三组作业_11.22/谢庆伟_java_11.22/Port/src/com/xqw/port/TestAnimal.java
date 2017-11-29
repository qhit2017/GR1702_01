package com.xqw.port;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月23日 上午8:51:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestAnimal {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.setName("德牧");
		d.setBreed("警用犬");
		d.setColor("黑色");
		d.setAge(5);
		d.eat();
		d.wow();
		System.out.println();
		Mouse m=new Mouse();
		m.setName("杰瑞");
		m.setBreed("家鼠");
		m.setLegs(4);
		m.setWeight(0.3);
		m.eat();
		m.wow();

	}

}
