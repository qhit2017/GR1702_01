package com.xiajie;
/**
 * @author  ����  E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date    ����ʱ��: 2017��11��23�� ����8:11:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Dog  implements IZoo{
	//b.��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����������Ʒ�֡���ɫ�����䣨����˽�У� �����������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	private String name;
	private String kind;
	private String color;
	private int age;
	
	

	/**
	 * 
	 */
	public Dog() {
	}

	
	/**
	 * @param name
	 */
	public Dog(String name) {
		this.name = name;
	}


	@Override
	public String eat() {
		System.out.println("���أ���");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Wow() {
		System.out.println("��Ŷ����");
		// TODO Auto-generated method stub
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
