package com.zk;

public class Address {
	private String name;
	private String sex;
	private String Num;

	public Address(String name, String sex, String num) {

		this.name = name;
		this.sex = sex;
		Num = num;
	}

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

	public String getNum() {
		return Num;
	}

	public void setNum(String num) {
		Num = num;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", sex=" + sex + ", Num=" + Num + "]";
	}

}
