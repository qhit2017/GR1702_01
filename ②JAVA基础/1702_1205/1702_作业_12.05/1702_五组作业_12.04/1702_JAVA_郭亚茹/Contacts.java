package com.test;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String tell;

	public Contacts(String name, String sex, String tell) {
		
		this.name = name;
		this.sex = sex;
		this.tell = tell;
	}

	public Contacts() {
	
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

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", tell=" + tell
				+ "]";
	}

}
