package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月23日 下午7:01:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal{

	String name;
	String breed;
	String color;
	@SuppressWarnings("unused")
	private int age;

	public Dog() {
		System.out.println("我是狗的无参构造方法");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "狗粮";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "汪汪汪";
	}

	public int getAge() {
		return 3;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
