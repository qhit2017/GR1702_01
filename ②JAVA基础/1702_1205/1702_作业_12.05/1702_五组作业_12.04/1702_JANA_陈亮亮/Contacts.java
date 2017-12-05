package com.qk;

public class Contacts {
	private String name;
	private String sex;
	private String phonenumber;

	public Contacts(String name, String sex, String phonenumber) {
		this.name = name;
		this.sex = sex;
		this.phonenumber = phonenumber;

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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", phonenumber="
				+ phonenumber + "]";
	}

}
