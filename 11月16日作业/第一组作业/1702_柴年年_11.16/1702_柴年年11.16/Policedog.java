package com.qhit.animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����8:45:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Policedog extends Dog {

	// ����һ���ࣺ��Ȯ ���̳е�һ����ࣺ��
	// ���ԣ����ʱ��
	// ������work
	String speed;

	public Policedog(int legcount, String eyecolor, String breed,
			String colour, int age, String weight, String speed) {
		super(legcount, eyecolor, breed, colour, age, weight);
		this.speed = speed;
	}

	void work() {
		System.out.println("ץС͵");
	}
}
