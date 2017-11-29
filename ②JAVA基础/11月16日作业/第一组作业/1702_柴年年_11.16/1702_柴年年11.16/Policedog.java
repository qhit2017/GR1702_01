package com.qhit.animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月15日 下午8:45:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Policedog extends Dog {

	// 定义一个类：警犬 并继承第一题的类：狗
	// 属性：最快时速
	// 方法：work
	String speed;

	public Policedog(int legcount, String eyecolor, String breed,
			String colour, int age, String weight, String speed) {
		super(legcount, eyecolor, breed, colour, age, weight);
		this.speed = speed;
	}

	void work() {
		System.out.println("抓小偷");
	}
}
