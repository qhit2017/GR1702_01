package com.qi.ke;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��15������8:13:20 ���䣺2507147605@qq.com
 */
public  class dog extends Animal{
	private String pinzhong ; //Ʒ��
	private String  colour ;//��ɫ
	private int age;//����
	private String weight ;//����
	void wow(){
	System.out.println("������");	
	
	}
	void  eat(){
	System.out.println("�ԳԳ�");	
	}
	void age(){
	System.out.println("˯������ƽ��");	
	}
	public String getPingzhong() {
		return pinzhong;
	}
	public void setPingzhong(String pingzhong) {
		this.pinzhong = pingzhong;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	void age(int a){
	System.out.println("˯������ƽ��");	
	
	}
	void age(int a,int b){
	System.out.println("˯������ƽ��");	
	
	}
}

