package com.zk;

public class Dog implements IZoology{
	
	/*b.��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����
	������Ʒ�֡���ɫ�����䣨����˽�У� �����������ֹ��췽��
	��1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	*/

	String name;//����
	String variety;//Ʒ��
	String colour;//��ɫ
	private int age;//����

	public String getEat() {
		// TODO Auto-generated method stub
		return "���Թ�ͷ��";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "���������У�";
	}
	
	public Dog() {
		
		
	}

	public Dog(String name) {
		
		this.name = name;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	

	
	
	
	

	
	}
	
	

	
	


