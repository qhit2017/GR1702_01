/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��4�� ����2:14:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Contacts;

public class Contacts {

	private String name;
	private String sex;
	private String phoneNumber;

	public Contacts() {
	}

	public Contacts(String name, String sex, String phoneNumber) {
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
