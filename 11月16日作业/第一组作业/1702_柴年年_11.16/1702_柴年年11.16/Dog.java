package com.qhit.animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月15日 下午8:14:25
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal {

	// 定义一个类：狗，
	// 属性包括： 品种，毛的颜色， 年龄，重量
	// 方法包括：叫、吃、睡觉
	private String breed;
	String colour;
	int age;
	String weight;

	public Dog(int legcount, String eyecolor, String breed, String colour,
			int age, String weight) {
		super(legcount, eyecolor);
		this.breed = breed;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
	}

	void cry() {
		System.out.println("叫");
	}

	void eat() {
		System.out.println("吃");
	}

	void sleep() {
		System.out.println("睡觉");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
