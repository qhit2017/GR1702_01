package com.xqw.port;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:47:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal{

	private String name;
	private String breed;
	private int legs;
	private double weight;
	public Mouse() {
	}
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
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
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public void eat() {
		System.out.println(name+"Ҳ�ڳ����......");
		
	}
	@Override
	public void wow() {
		System.out.println(name+"��������У����ϵ�ߴߴ��");
		
	}
	
}
