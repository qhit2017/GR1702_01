/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��23�� ����9:32:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class Test {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("��ʿ��");
		dog.setVariety("����Ʒ��");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());

		IAnimal.geteat();
		IAnimal.getwow();
		Mouse mouse = new Mouse();

		mouse.setName("����");
		mouse.setVariety("С����");
		mouse.setLeg(4);
		mouse.setWeight("5��");
		mouse.toString();
		System.out.println(mouse.toString());
		IAnimal.geteat();
		IAnimal.getwow();
	}

}
