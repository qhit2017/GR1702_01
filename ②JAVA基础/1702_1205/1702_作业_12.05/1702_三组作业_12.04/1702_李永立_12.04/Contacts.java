package com.lyl;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��4�� ����2:18:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Contacts {
	
	private String name;
	private String set;
	private String num;
	
	
	
	
	public Contacts() {
		super();
	}




	public Contacts(String name, String set, String num) {
		super();
		this.name = name;
		this.set = set;
		this.num = num;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSet() {
		return set;
	}




	public void setSet(String set) {
		this.set = set;
	}




	public String getNum() {
		return num;
	}




	public void setNum(String num) {
		this.num = num;
	}




	@Override
	public String toString() {
		return "Contacts [name=" + name + ", set=" + set + ", num=" + num + "]";
	}
	
	

}
