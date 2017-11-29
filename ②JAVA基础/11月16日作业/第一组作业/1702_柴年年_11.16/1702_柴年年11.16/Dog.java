package com.qhit.animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����8:14:25
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal {

	// ����һ���ࣺ����
	// ���԰����� Ʒ�֣�ë����ɫ�� ���䣬����
	// �����������С��ԡ�˯��
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
		System.out.println("��");
	}

	void eat() {
		System.out.println("��");
	}

	void sleep() {
		System.out.println("˯��");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
