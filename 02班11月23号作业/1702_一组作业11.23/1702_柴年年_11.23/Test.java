package com.qhit.Animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����8:35:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "��";
		System.out.println("����:" + dog.name);
		dog.breed = "��Ȯ";
		System.out.println("Ʒ��:" + dog.breed);
		dog.color = "��ɫ";
		System.out.println("��ɫ:" + dog.color);
		System.out.println("��:" + dog.getEat());
		System.out.println("��:" + dog.getCry());
		System.out.println("����:" + dog.getAge());

		Mouse mouse = new Mouse();
		mouse.name = "��";
		System.out.println("����:" + mouse.name);
		mouse.breed = "����";
		System.out.println("Ʒ��:" + mouse.breed);
		mouse.leg = 4;
		System.out.println("������:" + mouse.leg);
		System.out.println("����:" + mouse.getWeight());
		System.out.println("��:" + mouse.getEat());
		System.out.println("��:" + mouse.getCry());
	}
}
