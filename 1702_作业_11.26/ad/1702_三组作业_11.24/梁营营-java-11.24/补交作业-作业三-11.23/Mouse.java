package com.test;

public class Mouse implements Animal {

	//������Ʒ�֣������ȣ�����
	private String name;
	private String breed;
	private int legs;
	private double wight;
	
	//�����޲εĹ��췽����
	public Mouse() {
		System.out.println("����Mouse����޲εĹ��췽����");
	}

	//��������Ϊ������Ʒ�ֵĹ��췽����
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	
	//����set,get
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
		System.out.println("���ǽ������ڳԴ��ף�");
		// TODO Auto-generated method stub

	}

	@Override
	public void wow() {
		System.out.println("֨֨֨��");
		// TODO Auto-generated method stub

	}

}
