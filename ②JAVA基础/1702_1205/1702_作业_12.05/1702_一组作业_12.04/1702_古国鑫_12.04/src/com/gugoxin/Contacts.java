package com.gugoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��4�� ����2:15:52 
 * @version 1.0  
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String telnum;
	
	
	
	
	public Contacts() {
		super();
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

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	public Contacts(String name, String sex, String telnum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telnum = telnum;
	}
	
	
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telnum=" + telnum
				+ "]";
	}
}
