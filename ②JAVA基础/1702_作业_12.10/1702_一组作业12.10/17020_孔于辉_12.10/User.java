package com.kyh;

public class User {

	String id;
	String name;
	String sex;

	public User(String id, String name, String sex) {
		
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User 工号：" + id + ", 姓名：" + name + ", 性别：" + sex + "";
	}
	
	
}
