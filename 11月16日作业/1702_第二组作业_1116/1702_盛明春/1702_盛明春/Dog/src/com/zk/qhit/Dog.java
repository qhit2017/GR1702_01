package com.zk.qhit;

public class Dog extends Animal {

	private String color;// ��ɫ
	private String breed;// ����
	private int age;// ����
	private double weight;// ����

	Dog() {
		System.out.println();
	}

	void eat() {
		System.out.println("��ҧ");
	}

	void cry() {
		System.out.println("����");
	}

	void sleep() {
		System.out.println("˯��");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
