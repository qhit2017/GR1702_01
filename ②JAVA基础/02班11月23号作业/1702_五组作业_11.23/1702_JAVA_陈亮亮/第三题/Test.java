package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��23������8:11:55
 *���䣺2507147605@qq.com
 */
public class Test {
public static void main(String[] args) {
	Dog dog = new Dog();
	dog.setName("����Ȯ");
	dog.setVariety("����Ȯ");
	dog.setColour("��ɫ");
	dog.setAge(5);
	System.out.println(dog.toString());

	Animal.eat();
	Animal.wow();
	Mouse mouse = new Mouse();

	mouse.setName("�ܿ�");
	mouse.setVariety("С����");
	mouse.setLeg(4);
	mouse.setWeight("5");
	mouse.toString();
	System.out.println(mouse.toString());
	Animal.eat();
	Animal.wow();
}

}



