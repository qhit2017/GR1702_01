package com.lyl;

 

public class Test {
	//.���������࣬�ֱ𴴽����������ʵ�������󣬸���������Ը�ֵ
	//�����ҵ��ö���ĳԡ��еķ���
 public static void main(String[] args) {
	 Dog dog = new Dog();
	 dog.setName("����");
	 dog.setBreed("��Ȯ");
	 dog.setColor("��ɫ");
	 dog.setAge(2);
	 System.out.println(dog.getEat());
	 System.out.println(dog.getCall());
	 
	 
	 //ʵ����MOUSE ����
	 Mouse mouse = new Mouse();
	 
	 mouse.setName("С�ɰ�");
	 mouse.setBreed("����");
	 mouse.setLeg(4);
	 mouse.setWeight(50.5);
	 
	 System.out.println(mouse.getEat());
	 System.out.println(mouse.getCall());
	 
	 
}
}
