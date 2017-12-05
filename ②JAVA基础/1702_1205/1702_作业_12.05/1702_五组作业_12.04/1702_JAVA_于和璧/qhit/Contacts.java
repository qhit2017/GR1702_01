package com.qhit;



public class Contacts {
	
	//成员变量
	private String name;
	private String sex;
	private String number;
	
	
	
	
	public Contacts() {
		super();
	}




	public Contacts(String name, String sex, String number) {
		super();
		this.name = name;
		this.sex = sex;
		this.number = number;
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

	
	public String getnumber() {
		return number;
	}
	public void setnumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", number=" + number
				+ "]";
	}
	
	
	

}
