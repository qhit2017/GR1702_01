package com.contacts;

public class Contacts {

	// ���ԣ�
	private String name;
	private String sex;
	private String telNum;

	// �޲ι��췽����
	public Contacts() {

	}

	// �вεĹ��췽����
	public Contacts(String name, String sex, String telNum) {
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	// ����Set get������

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

	// ����toString������
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}

}
