package com.qh;

public class Contacts {
	// ��Ա����
	private String name;
	private String sex;
	private String telNum;

	// ���췽��
	public Contacts(String name, String sex, String telNum) {
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	// get��set����
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

	// toString����
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}
}
