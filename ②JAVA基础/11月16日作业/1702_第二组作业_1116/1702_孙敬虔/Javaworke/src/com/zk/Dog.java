package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:54:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{

	private String color;
	private double weight;
	private int age;
	private String breed;
	
	void eat (){
		System.out.println("��");
	}
	void cry(){
		System.out.println("����");
	}
	void sleep(){
		System.out.println("˯��");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
}
