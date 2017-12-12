/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午5:40:19 
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
