package com.kyh;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("������", "��ʿ��");

		System.out.println(dog.name);

		System.out.println("��������" + dog.variety);

		System.out.println("�����ӽ���" + dog.getAge() + "��");

		dog.color = "�ڰ����";
		System.out.println("��������" + dog.color);

		System.out.println("������ϲ��" + dog.eat());
		;

		System.out.println("������ϲ��" + dog.wow() + "������");

		System.out.println();

		Mouse mouse = new Mouse("�ܿ�", "����");

		System.out.println(mouse.name);

		System.out.println("�ܿ���" + mouse.varivety);

		mouse.leg = 4;
		System.out.println("�ܿ���" + mouse.leg + "����");

		System.out.println("�ܿ���" + mouse.getWeight() + "kg");

		System.out.println("�ܿ�" + mouse.eat());

		System.out.println("�ܿ�������" + mouse.wow() + "��");
	}

}
