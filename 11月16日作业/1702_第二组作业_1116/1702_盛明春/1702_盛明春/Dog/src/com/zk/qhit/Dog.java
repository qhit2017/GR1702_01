package com.zk.qhit;

public class Dog extends Animal {

	private String color;// 颜色
	private String breed;// 种类
	private int age;// 年龄
	private double weight;// 体重

	Dog() {
		System.out.println();
	}

	void eat() {
		System.out.println("啃咬");
	}

	void cry() {
		System.out.println("汪汪");
	}

	void sleep() {
		System.out.println("睡觉");
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
