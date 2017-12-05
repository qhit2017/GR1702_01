package com.contacts;

public class Contacts {

	// 属性；
	private String name;
	private String sex;
	private String telNum;

	// 无参构造方法；
	public Contacts() {

	}

	// 有参的构造方法；
	public Contacts(String name, String sex, String telNum) {
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	// 创建Set get方法；

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	// 创建toString方法；
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}

}
