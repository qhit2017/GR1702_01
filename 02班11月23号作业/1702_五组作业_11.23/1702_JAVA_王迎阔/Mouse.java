package com.qhit.wyk;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:47:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Mouse implements Zoology {

	private String name;
	private int leg;
	private String breed;
	private String weight;

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

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", leg=" + leg + ", breed=" + breed
				+ ", weight=" + weight + "]";
	}
	
}
