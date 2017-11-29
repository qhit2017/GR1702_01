/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��23�� ����9:25:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class Dog implements IAnimal {

	
	
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
