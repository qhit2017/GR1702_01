package com.zk.qhit.test;
//作者：梁营营；
//作业一;
public class Dog extends Animal {
//定义属性；
	private String breed;
	private String color;
	private int    age;
	private int    weight;
	void wow (){
		System.out.println("汪汪汪！");
	}
	void eat (){
		System.out.println("进食中！");
	}
	void sleep (){
		System.out.println("睡眠中！");
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



