package com.lyl;

public class Mouse implements  Animal {
	
	private String name  ;
	private String  breed ;
	private double weight  ;
	private int leg ;
	
	
	
	//�޲ι��췽��
   public Mouse() {
		super();
	}
  //�вι��췽��
public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

  
	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "�Դ���";
	}

	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return "ߴߴߴ";
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}


}
