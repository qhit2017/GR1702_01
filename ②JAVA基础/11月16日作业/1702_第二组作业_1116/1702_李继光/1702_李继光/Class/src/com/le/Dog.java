package com.le;

public class Dog extends Animal{
	private String breed;//Ʒ��
	private String colour;//ë����ɫ
	private int age;
	private double weight;
	//����
	void eat(){
		System.out.println("��Ȯÿ�춼����");
	}
	void cry(){
		System.out.println("��");
	}
	void sleep(){
		System.out.println("˯��");
	}
	//get set����
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
