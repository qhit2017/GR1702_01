package com.qhit.wyk;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月23日 下午7:40:18
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
