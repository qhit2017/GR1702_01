package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��23�� ����6:51:57 
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
		System.out.println("�޲�");
	}
	public Dog(String name){
		this.name = name;
	}
	@Override
	public void getEat() {
		System.out.println("��ͷ");
	}
	@Override
	public void getCry() {
		System.out.println("������");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	

}
