package com.test;

public class Dog implements Animal {
	//������Ʒ�֡���ɫ������
	private String name;
	private String breed;
	private String color;
	private int age;
	
	//�����޲εĹ��췽����
	public Dog() {
		System.out.println("����Dog����޲εĹ��췽����");
	}
	
	//��������Ϊ�����Ĺ��췽����
	public Dog(String name) {
		this.name = name;
	}
	
	//����set,get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ǽ�ë�����ڳ�������");
	}

	@Override
	public void wow() {
		System.out.println("��������");
		// TODO Auto-generated method stub

	}

}
