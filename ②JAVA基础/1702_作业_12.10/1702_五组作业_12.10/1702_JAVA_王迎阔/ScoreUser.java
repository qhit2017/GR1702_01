package com.user;
/**
 * @author  作者 E-mail:295852280@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreUser {

	//1、将员工信息封装称User类的对象。
	//使用HashMap对象保存员工对象，查找姓名为”tom”的员工信息，并遍历所有员工信息；
	//提供集合对象的初始化、添加、查找、修改、删除、遍历；
	//（提示：向HashMap中添加元素使用put(key , value)方法；
	//取值通过get(key)得到Value值。遍历HashMap需要先得到集合中所有的key，再通过key得到对应的value值 。）
	private String id;
	private String name;
	private String Sex;
	
	
	/**
	 * 
	 */
	public ScoreUser() {
		super();
	}


	/**
	 * @param name
	 * @param sex
	 * @param id
	 */
	public ScoreUser( String id,String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		Sex = sex;
		
	}
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return Sex;
	}


	public void setSex(String sex) {
		Sex = sex;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Sex=" + Sex + "]";
	}


	
	
}
