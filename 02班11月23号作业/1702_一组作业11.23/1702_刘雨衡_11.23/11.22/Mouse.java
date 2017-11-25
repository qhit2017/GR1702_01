package com.kyh;

public class Mouse implements IAnimals {

	String name;
	String varivety;
	int leg;
	private double weight;

	public Mouse() {

	}

	public Mouse(String name, String varivety) {
		super();
		this.name = name;
		this.varivety = varivety;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "œ≤ª∂≥‘ƒÃ”Õ";
	}

	@Override
	public String wow() {
		// TODO Auto-generated method stub
		return "÷®÷®÷®";
	}

	public double getWeight() {
		weight = 1.56;
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
