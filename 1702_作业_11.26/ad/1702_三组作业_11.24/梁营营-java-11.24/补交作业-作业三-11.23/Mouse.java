package com.test;

public class Mouse implements Animal {

	//姓名，品种，几条腿，体重
	private String name;
	private String breed;
	private int legs;
	private double wight;
	
	//创建无参的构造方法；
	public Mouse() {
		System.out.println("我是Mouse类的无参的构造方法！");
	}

	//创建参数为姓名，品种的构造方法；
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
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

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	
	
	@Override
	public void eat() {
		System.out.println("我是杰瑞，我在吃大米！");
		// TODO Auto-generated method stub

	}

	@Override
	public void wow() {
		System.out.println("吱吱吱！");
		// TODO Auto-generated method stub

	}

}
