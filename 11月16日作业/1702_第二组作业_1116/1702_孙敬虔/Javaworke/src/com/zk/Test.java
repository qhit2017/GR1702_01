package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:34:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @func
 */
public class Test {

	public static void main(String[] args) {
		
		Policedog dog =new Policedog();
		dog.setBreed("����Ȯ");
		dog.setColor("��ɫ");
		dog.setWeight(24);
		dog.setAge(3);
		dog.eyes="��ɫ";
		dog.legs=4;
		dog.speed="65Km/h";
		System.out.println("�þ�Ȯ��Ʒ��Ϊ��"+dog.getBreed());
		System.out.println("�þ�ȮëɫΪ��"+dog.getColor());
		System.out.println("�þ�Ȯ����Ϊ:"+dog.getWeight());
		System.out.println("�þ�Ȯ����Ϊ��"+dog.getAge());
		System.out.println("�þ�Ȯ�۾���ɫΪ��"+dog.eyes);
		System.out.println("�þ�Ȯ����Ϊ��"+dog.legs);
		System.out.println("�þ�Ȯʱ��Ϊ��"+dog.speed);
		dog.eat();
		dog.work();
	}
}
