package com.xqw.port;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��22�� ����9:47:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal{

	private String name;
	private String breed;
	private String color;
	private int age;
	
	public Dog() {
	}
	public Dog(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void eat() {
		System.out.println(name+"���ڳ����......");
		
	}
	@Override
	public void wow() {
		System.out.println(name+"������ʲô�������˾����Ľ�����");
		
	}
	
	

}
