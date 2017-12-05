package com.contats;

public class Contacts {

	private String name;
	private String sex;
	private String teiNum;

	public Contacts() {

	}

	public Contacts(String name, String sex, String teiNum) {
		super();
		this.name = name;
		this.sex = sex;
		this.teiNum = teiNum;
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

	public String getTeiNum() {
		return teiNum;
	}

	public void setTeiNum(String teiNum) {
		this.teiNum = teiNum;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", teiNum=" + teiNum
				+ "]";
	}

}
