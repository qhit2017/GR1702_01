package com.le;

public class Test {
public static void main(String[] args) {
	PoliceDog dog = new PoliceDog();
	dog.setBreed("����");
	dog.setColour("��ɫ");
	dog.setWeight(30);
	dog.setAge(3);
	dog.eye="��ɫ";
	dog.leg=4;
	dog.speed="40km/h";
	System.out.println("��Ȯ��Ʒ��Ϊ��"+dog.getBreed());
	System.out.println("��Ȯë����ɫ��"+dog.getColour());
	System.out.println("��Ȯ������Ϊ��"+dog.getWeight()+"kg");
	System.out.println("��Ȯ����"+dog.getAge()+"��");
	System.out.println("��Ȯ�۾�����ɫ�ǣ�"+dog.eye);
	System.out.println("��Ȯ��"+dog.leg+"��");
	System.out.println("��Ȯ��ʱ��"+dog.speed);
	dog.eat();
	dog.work();
	
	
	
}
}
