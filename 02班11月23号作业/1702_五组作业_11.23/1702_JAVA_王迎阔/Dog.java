package com.qhit.wyk;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:40:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog implements Zoology {

	private String name;
	private int age;
	private String breed;
	private String colour;

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

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed
				+ ", colour=" + colour + "]";
	}

	
	
	

}
