package com.xx;

public class Contacts {
	//1����Ա����������
	//2���вκ��޲εĹ��췽��
	//3��set  get����
	//4��toString����
	
	private String name;
	private String sex;
	private String telNum;
	
	
	public Contacts(){
		
	}
	
	public Contacts(String name, String sex, String telNum) {
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
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

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "��ϵ��[������" + name + ",�Ԅe��" + sex + ", �绰" + telNum
				+ "]";
	}
	
	
	
}
