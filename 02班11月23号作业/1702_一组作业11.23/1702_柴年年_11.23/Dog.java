package com.qhit.Animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 上午8:25:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog implements Animal {

	String name;
	String breed;
	String color;
	private int age;

	public Dog() {
		System.out.println("我是一个狗类的无参构造方法");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "火腿";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "汪";
	}

	public int getAge() {
		return 26;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
