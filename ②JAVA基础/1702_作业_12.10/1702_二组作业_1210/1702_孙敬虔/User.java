package com.hashnap.zk;

public class User {
	
	String name;
	private int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Ա����Ϣ[������" + name + ", ���䣺" + age +", ";
	}

}
