package com.AddressBook;

public class Contatc {
	
	private String name;
	private String sex;
	private String telNum;
	
	
	
	
	public Contatc() {
		
	}



	public Contatc(String name, String sex, String telNum) {
		
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
		return "Contatc [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}
	
	

}
