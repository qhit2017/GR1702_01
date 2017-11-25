package com.qhit.wyk;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月23日 下午8:07:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class TestZoology {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("牧羊犬");
		System.out.println(dog.toString());
		Zoology.eat();
		Zoology.wow();

		Mouse mouse = new Mouse();
		mouse.setName("杰瑞");
		System.out.println(mouse.toString());
		Zoology.eat();
		Zoology.wow();

	}
}
