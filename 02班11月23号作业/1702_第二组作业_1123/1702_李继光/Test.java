package com.xx;
//��
public class Test {
public static void main(String[] args) {
	Dog dog = new Dog("Dragon");
	dog.breed="��ʿ��";
	dog.colour="�Ұ�";
	dog.setAge(2);
	System.out.println("����"+dog.name);
	System.out.println("��һֻ"+dog.breed);
	System.out.println(dog.colour+"ɫ��");
	System.out.println("Dragon����"+dog.getAge()+"��");
	System.out.print("Dragon����������");
	dog.getEat();
	System.out.print("Dragon��������");
	dog.getCry();
//-------------------------------------------------------
	Mouse mouse = new Mouse("Haohao","����");
	mouse.leg="4��";
	mouse.setWeight("0.5kg");
	System.out.println("����һֻС"+mouse.breed+"����"+mouse.name);
	System.out.println("����"+mouse.leg+"�ȣ����ᣬֻ��"+mouse.getWeight());
	mouse.getEat();
	mouse.getCry();
}
}
