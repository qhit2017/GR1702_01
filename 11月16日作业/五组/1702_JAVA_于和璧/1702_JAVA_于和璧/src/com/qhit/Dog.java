package com.qhit;

public class Dog   extends Zoology {
	//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����  �����������С��ԡ�˯��
    //Ҫ������˽�У����ṩget��set���� 
	private String variety;//����
    private String colour;//��ɫ
	private int age;//����
	private double weight;//����  ��λ����
	
	
	void wow(){
		System.out.println("������������");
	}
	void eat(){
		System.out.println("ϲ���Թ�ͷ��");
	}
	void sleep(){
		System.out.println("˯���Ǽ����õ����飡");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
