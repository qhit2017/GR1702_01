package com.zk.qhit.test;
//���ߣ���ӪӪ��
//��ҵһ;
public class Dog extends Animal {
//�������ԣ�
	private String breed;
	private String color;
	private int    age;
	private int    weight;
	void wow (){
		System.out.println("��������");
	}
	void eat (){
		System.out.println("��ʳ�У�");
	}
	void sleep (){
		System.out.println("˯���У�");
	}
	Dog(String breed, String color,int age, int weight) {
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		this.age = age;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}



