package com.xx;
//��
public class Dog implements IAnimal {
	String name;//����
	String breed;//Ʒ��
	String colour;//��ɫ
	private int age;//����
	//�������ֹ��췽��
	public Dog(){
		System.out.println();
	}
	
	public Dog(String name) {
		this.name = name;
	}
	//���ýӿڵĳ��󷽷�
	@Override
	public void getEat() {
		// TODO Auto-generated method stub
		System.out.println("���̻���");
	}

	@Override
	public void getCry() {
		// TODO Auto-generated method stub
		System.out.println("���ȵ�");
	}
	///��װ
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	












}
