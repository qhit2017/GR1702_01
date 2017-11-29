package com.ssx;

public abstract class Person {
	//定义成员变量
	String name;//名字
	int age;//年龄
	//构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public abstract String getContent(String character);
	String say(){
		System.out.println(this.getContent(name));
		return name;
	}


}
