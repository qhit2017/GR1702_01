package com.ssx;

public abstract class Person {
	//�����Ա����
	String name;//����
	int age;//����
	//���췽��
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
