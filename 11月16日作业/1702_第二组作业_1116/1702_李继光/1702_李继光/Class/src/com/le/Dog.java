package com.le;

public class Dog extends Animal{
	private String breed;//品种
	private String colour;//毛的颜色
	private int age;
	private double weight;
	//方法
	void eat(){
		System.out.println("警犬每天都吃肉");
	}
	void cry(){
		System.out.println("叫");
	}
	void sleep(){
		System.out.println("睡觉");
	}
	//get set方法
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
