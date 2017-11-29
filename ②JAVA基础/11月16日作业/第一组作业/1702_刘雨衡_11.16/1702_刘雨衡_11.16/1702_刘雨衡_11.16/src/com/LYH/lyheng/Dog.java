package com.kyh.qhit;

/**
 * @author 作者 E-mail:1299394372@qq.com
 * @date 创建时间：2017年11月16日 下午8:32:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal{

	private String variety;
	private String color;
	private int age;
	private String weight;

	



	void wow() {
		System.out.println("汪汪汪！！！");
	}

	void eat() {
		System.out.println("我要吃肉！！！");
	}

	void sleep() {
		System.out.println("我要好好休息！");
	}

	/**
	 * @return the variety
	 */
	public String getVariety() {
		return variety;
	}

	/**
	 * @param variety
	 *            the variety to set
	 */
	public void setVariety(String variety) {
		this.variety = variety;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
