package com.zk;

public class Test {
	//d.���������࣬�ֱ𴴽����������ʵ�������󣬸���������Ը�ֵ�����ҵ��ö���ĳԡ��еķ���
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.setName("С��");
		dog.setVariety("��ĦҮ");
		dog.setColour("��ɫ");
		dog.setAge(3);
		
		System.out.println("���ֽУ�"+dog.getName()+"\n"+"Ʒ��Ϊ��"
							+dog.getVariety()+"\n"+"ëɫΪ��"
							+dog.getColour()+"\n"+"����Ϊ��"+dog.getAge()+"��");
		
		System.out.println(dog.getWow());
		
		System.out.println(dog.getEat());
		
		System.out.println();
		
		Mouse mouse = new Mouse();
		mouse.setName("С��");
		mouse.setVariety("������");
		mouse.setLeg(2);
		mouse.setWeight(23.5);
		
		System.out.println("���ֽУ�"+mouse.getName()+"\n"+"Ʒ��Ϊ��"
							+mouse.getVariety()+"\n"+"�ȵ�����Ϊ��"
							+mouse.getLeg()+"\n"+"����Ϊ��"+mouse.getWeight()+"�");
		
		System.out.println(mouse.getEat());
		
		System.out.println(mouse.getWow());
}
}
