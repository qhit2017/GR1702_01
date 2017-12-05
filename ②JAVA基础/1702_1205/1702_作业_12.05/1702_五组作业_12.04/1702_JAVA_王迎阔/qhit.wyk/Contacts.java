package com.Contacts;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午4:24:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String telNum;

	/**
	 * 
	 */
	public Contacts() {
		super();
	}

	/**
	 * @param name
	 * @param sex
	 * @param telNum
	 */
	public Contacts(String name, String sex, String telNum) {
		super();
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
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}

}
