package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��23�� ����7:01:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animal{

	String name;
	String breed;
	String color;
	@SuppressWarnings("unused")
	private int age;

	public Dog() {
		System.out.println("���ǹ����޲ι��췽��");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "������";
	}

	public int getAge() {
		return 3;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
