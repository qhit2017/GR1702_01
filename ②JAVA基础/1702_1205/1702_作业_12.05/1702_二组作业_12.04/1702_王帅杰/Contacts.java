package com.qhit;
//��һ��Javabeanʵ����
public class Contacts {

	private String name;
	private String sex;
	private String telNum;

	// �޲ι��췽��
	public Contacts() {
		super();
	}

	// �вι��췽��
	public Contacts(String name, String sex, String telNum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
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

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}

}
