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
		return "User ���ţ�" + id + ", ������" + name + ", �Ա�" + sex + "";
	}
	
	
}
