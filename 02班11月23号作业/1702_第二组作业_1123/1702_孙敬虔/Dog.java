package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月23日 下午6:51:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal {
	String name;
	String breed;
	String color;
	private int age;
	
	

	public Dog(){
		System.out.println("无参");
	}
	public Dog(String name){
		this.name = name;
	}
	@Override
	public void getEat() {
		System.out.println("骨头");
	}
	@Override
	public void getCry() {
		System.out.println("汪汪汪");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	

}
