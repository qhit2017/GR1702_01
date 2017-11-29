package com.test;

public class Dog implements Animal {
	//姓名、品种、颜色、年龄
	private String name;
	private String breed;
	private String color;
	private int age;
	
	//创建无参的构造方法；
	public Dog() {
		System.out.println("我是Dog类的无参的构造方法！");
	}
	
	//创建参数为姓名的构造方法；
	public Dog(String name) {
		this.name = name;
	}
	
	//创建set,get

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
		System.out.println("我是金毛，我在吃面条！");
	}

	@Override
	public void wow() {
		System.out.println("汪汪汪！");
		// TODO Auto-generated method stub

	}

}
