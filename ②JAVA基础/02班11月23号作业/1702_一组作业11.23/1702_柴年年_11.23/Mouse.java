package com.qhit.Animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����8:31:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Mouse implements Animal {

	String name;
	String breed;
	int leg;
	private double weight;

	Mouse() {
		System.out.println("����һ��������޲ι��췽��");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "��";
	}

	public double getWeight() {
		return 10.9;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
