package com.test;

public class Test {
	

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("��ë");
		dog.setBreed("����");
		dog.setColor("��ɫ");
		dog.setAge(3);
		System.out.println("������"+dog.getName());
		System.out.println("Ʒ�֣�"+dog.getBreed());
		System.out.println("��ɫ��"+dog.getColor());
		System.out.println("���䣺"+dog.getAge());
		dog.eat();
		dog.wow();
		
		Mouse mouse = new Mouse();
		mouse.setName("����");
		mouse.setBreed("����");
		mouse.setLegs(4);
		mouse.setWight(2.5);
		System.out.println("������"+mouse.getName());
		System.out.println("Ʒ�֣�"+mouse.getBreed());
		System.out.println("�ȸ�����"+mouse.getLegs());
		System.out.println("���أ�"+mouse.getWight());
		mouse.eat();
		mouse.wow();
	}
}
