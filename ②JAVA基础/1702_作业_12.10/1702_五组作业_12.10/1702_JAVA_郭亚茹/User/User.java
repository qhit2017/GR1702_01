package com.User;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User {
	
	//1、将员工信息封装称User类的对象。
	//使用HashMap对象保存员工对象，查找姓名为”tom”的员工信息，并遍历所有员工信息
	//提供集合对象的初始化、添加、查找、修改、删除、遍历；
	//（提示：向HashMap中添加元素使用put(key , value)方法；取值通过get(key)得到Value值。遍历HashMap需要先得到集合中所有的key，再通过key得到对应的value值 。）

	private String name;
	private String id;
	private String sex;
	private double salary;
	
	public User() {
		
	}


	public User(String name,String id, String sex, double salary) {
		
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex
				+ ", salary=" + salary + "]";
	}
	
	
}
