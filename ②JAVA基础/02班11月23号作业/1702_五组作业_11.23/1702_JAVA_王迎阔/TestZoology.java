package com.qhit.wyk;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����8:07:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class TestZoology {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("����Ȯ");
		System.out.println(dog.toString());
		Zoology.eat();
		Zoology.wow();

		Mouse mouse = new Mouse();
		mouse.setName("����");
		System.out.println(mouse.toString());
		Zoology.eat();
		Zoology.wow();

	}
}
