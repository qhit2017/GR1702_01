package com.dog;

public class Class extends Animal{
	private String breed;// 品种
	private String colour;// 颜色
	private int age;// 年龄
	private double weight;// 重量

	void cry() {
		System.out.println("叫");
	}

	void eat() {
		System.out.println("吃");
	}

	void sleep() {
		System.out.println("睡觉");

	}

	// get、set方法
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
