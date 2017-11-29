package com.xx;
//二
public class Dog implements IAnimal {
	String name;//名字
	String breed;//品种
	String colour;//颜色
	private int age;//年龄
	//创建两种构造方法
	public Dog(){
		System.out.println();
	}
	
	public Dog(String name) {
		this.name = name;
	}
	//调用接口的抽象方法
	@Override
	public void getEat() {
		// TODO Auto-generated method stub
		System.out.println("狼吞虎咽");
	}

	@Override
	public void getCry() {
		// TODO Auto-generated method stub
		System.out.println("萌萌的");
	}
	///封装
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	












}
