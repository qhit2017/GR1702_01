package com.kyh;

public class Mouse implements IAnimals {

	String name;// 名字
	String varivety;// 品种
	int leg;// 腿
	private double weight;// 体重

	public Mouse() {

	}// 无参

	public Mouse(String name, String varivety) {
		super();
		this.name = name;
		this.varivety = varivety;
	}// 有参

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "喜欢吃奶油";
	}

	@Override
	public String wow() {
		// TODO Auto-generated method stub
		return "吱吱吱";
	}

	public double getWeight() {
		weight = 1.56;
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
