package com.zk.qhit;

public class Test {
	public static void main(String[] args) {
		PoliceDog dog = new PoliceDog();
		dog.setAge(5);
		dog.setBreed("��������");
		dog.setWeight(20);
		dog.setColor("��ɫ");
		dog.eyescolor = "��ɫ";
		dog.leg = 4;
		dog.speed = "45km/h";
		System.out.print("����:" + dog.getBreed() + "\n" + "����:" + dog.getAge()
				+ "\n" + "ë����ɫ:" + dog.getColor() + "\n" + "����:"
				+ dog.getWeight() + "\n" + "��ɫ:" + dog.eyescolor + "\n"
				+ "�ȵ�����:" + dog.leg + "\n" + "���ʱ��:" + dog.speed + "\n");
		dog.eat();
		dog.work();
	}
}