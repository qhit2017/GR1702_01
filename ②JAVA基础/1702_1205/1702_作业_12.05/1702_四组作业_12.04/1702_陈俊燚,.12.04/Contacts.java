//ʵ����
package com.chen;

public class Contacts {
    //��Ա����������
	 private String name;
	 private String sexs;
	 private String telNum;
	 //�޲�
	public Contacts() {
		super();
	}
   //�в�
	public Contacts(String name, String sexs, String telNum) {
		this.name = name;
		this.sexs = sexs;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexs() {
		return sexs;
	}

	public void setSexs(String sexs) {
		this.sexs = sexs;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sexs=" + sexs + ", telNum="
				+ telNum + "]";
	}
	 
}
