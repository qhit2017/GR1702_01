package com.qhit;

public class Dog   extends Zoology {
	//定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
    //要求属性私有，并提供get、set方法 
	private String variety;//种类
    private String colour;//颜色
	private int age;//年龄
	private double weight;//重量  单位：斤
	
	
	void wow(){
		System.out.println("汪！汪！汪！");
	}
	void eat(){
		System.out.println("喜欢吃骨头！");
	}
	void sleep(){
		System.out.println("睡觉是件美好的事情！");
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
