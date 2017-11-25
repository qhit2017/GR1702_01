package com.xqw.port;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月23日 上午8:47:24 
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
		System.out.println(name+"也在吃午餐......");
		
	}
	@Override
	public void wow() {
		System.out.println(name+"发现了天敌，不断地叽叽叫");
		
	}
	
}
