/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����5:40:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.homework;

public class User {

	private String name;
	private String sex;
	

	public User() {
	}

	public User(String name, String sex) {
		this.name = name;
		
		this.sex = sex;
		
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + "]";
	}

}
