package com.qhit;

public class PoliceDogTest {
	//����һ�������࣬ʵ����һ����Ȯ�������þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
    //�������ĳԵķ�����work����
public static void main(String[] args) {
	
	PoliceDog a = new PoliceDog();
	a.setVariety("��ĦҮ");
	System.out.println("��ȮƷ��Ϊ��"+a.getVariety());
	a.setColour("ѩ��ɫ");
	System.out.println("ë����ɫΪ��"+a.getColour());
	a.setWeight(50.5);
	System.out.println("����Ϊ��"+a.getWeight());
	a.setAge(3);
	System.out.println("����Ϊ��"+a.getAge());
	a.eye="��ɫ";																								
	System.out.println("�۾���ɫΪ��"+a.eye);
	a.leg=4;
	System.out.println("�ȵ�����Ϊ��"+a.leg);
	a.speed=10.2;
	System.out.println("���ʱ��Ϊ��"+a.speed);
	a.eat();
	a.work();
	
}
}														
