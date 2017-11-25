package com.kyh;

public class Dog implements IAnimals {

	String name;
	String variety;
	String color;
	private int age;

	public Dog() {

	}

	public Dog(String name, String variety) {
		super();
		this.name = name;
		this.variety = variety;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "³ÔÈâ";
	}

	@Override
	public String wow() {
		// TODO Auto-generated method stub
		return "ÍôÍôÍô";
	}

	public int getAge() {

		age = 4;
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

}
