package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月23日下午8:10:38
 *邮箱：2507147605@qq.com
 */
public class Dog implements Animal{
	private String name;
	private String variety;
	private String colour;
	private int age;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Dog [name=" + name + ", variety=" + variety + ", colour="
				+ colour + ", age=" + age + "]";
	}

}


