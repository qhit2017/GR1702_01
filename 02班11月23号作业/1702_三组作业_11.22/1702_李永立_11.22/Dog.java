package com.lyl;

public class Dog  implements  Animal{
	//����
	private String name;
	private String  breed;
	private String color;
	private int age;
	
	
	//�޲ι��췽��
	public Dog() {
		super();
	}
	
  //�вι��췽��
	public Dog(String name) {
		super();
		this.name = name;
	}


	public String speed;

	@Override
	public String   getEat() {
		// TODO Auto-generated method stub
		return "�ԳԳ�";  
	}

	@Override
	public String   getCall() {
		// TODO Auto-generated method stub
		return "������";
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

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	
	
}
