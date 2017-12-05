package com.contacts;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午2:15:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String telnum;
	
	public Contacts() {
	}
	public Contacts(String name, String sex, String telnum) {
		this.name = name;
		this.sex = sex;
		this.telnum = telnum;
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
	
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telnum=" + telnum
				+ "]";
	}
	
}
