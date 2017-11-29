package com.kyh;

public class Dog implements IAnimals {

	String name;// 名字
	String variety;// 品种
	String color;// 颜色
	private int age;// 年龄

	public Dog() {

	}// 无参

	public Dog(String name, String variety) {
		super();
		this.name = name;
		this.variety = variety;
	}// 有两个参数

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "吃肉";
	}

	@Override
	public String wow() {
		// TODO Auto-generated method stub
		return "汪汪汪";
	}

	public int getAge() {

		age = 4;
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

}
