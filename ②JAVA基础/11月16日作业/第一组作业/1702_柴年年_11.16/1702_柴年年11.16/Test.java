package com.qhit.animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����8:52:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	// ����һ�������࣬ʵ����һ����Ȯ����
	// ���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ��
	public static void main(String[] args) {
		Policedog io = new Policedog(4, "��ɫ", "��Ȯ", "��ɫ", 26, "58����", "120/h");
		System.out.println("Ʒ��:" + io.getBreed());
		System.out.println("ë����ɫ:" + io.colour);
		System.out.println("����:" + io.weight);
		System.out.println("����:" + io.age);
		System.out.println("�۾���ɫ:" + io.eyecolor);
		System.out.println("�ȵ�����:" + io.legcount);
		System.out.println("���ʱ��:" + io.speed);
		io.cry();
		io.eat();
		io.sleep();
		io.work();

	}
}
