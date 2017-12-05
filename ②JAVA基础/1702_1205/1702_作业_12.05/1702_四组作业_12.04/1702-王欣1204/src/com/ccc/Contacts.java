package com.ccc;

public class Contacts {

	private String name;
	private String number;
	private String sex;

	public Contacts() {
		super();
	}

	public Contacts(String name, String number, String sex) {
		super();
		this.name = name;
		this.number = number;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", number=" + number + ", sex=" + sex
				+ "]";
	}

}
