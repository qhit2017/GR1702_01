package com.dog;

public class Test {
	public static void main(String[] args) {
		Policedog a = new Policedog();
		a.setBreed("�¹�����Ȯ");
		a.setColour("��ɫ");
		a.setWeight(20);
		a.setAge(4);
		a.setColour("��ɫ");
		a.leg = 4;
		a.speed = "40km/h";
		System.out.println("��ȮƷ��Ϊ��" + a.getBreed());
		System.out.println("��Ȯë����ɫ:" + a.getColour());
		System.out.println("��Ȯ����Ϊ:" + a.getWeight() + "kg");
		System.out.println("��Ȯ����Ϊ��" + a.getAge() + "��");
		System.out.println("��Ȯ�۾���ɫΪ��" + a.getColour());
		System.out.println("��Ȯ�ȵ�����Ϊ��" + a.leg + "��");
		System.out.println("��Ȯ���ʱ��Ϊ��" + a.speed);
		a.eat();
		a.work();

	}
}
