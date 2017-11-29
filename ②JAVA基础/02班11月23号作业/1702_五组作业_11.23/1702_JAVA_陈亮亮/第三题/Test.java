package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月23日下午8:11:55
 *邮箱：2507147605@qq.com
 */
public class Test {
public static void main(String[] args) {
	Dog dog = new Dog();
	dog.setName("牧羊犬");
	dog.setVariety("牧羊犬");
	dog.setColour("黄色");
	dog.setAge(5);
	System.out.println(dog.toString());

	Animal.eat();
	Animal.wow();
	Mouse mouse = new Mouse();

	mouse.setName("杰克");
	mouse.setVariety("小白鼠");
	mouse.setLeg(4);
	mouse.setWeight("5");
	mouse.toString();
	System.out.println(mouse.toString());
	Animal.eat();
	Animal.wow();
}

}



