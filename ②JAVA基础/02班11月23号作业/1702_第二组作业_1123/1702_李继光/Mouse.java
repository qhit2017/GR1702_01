package com.xx;
//��
public class Mouse implements IAnimal{
	String name;//����
	String breed;//Ʒ��
	String leg;//������
	private String weight ;//����
	//���ֹ��췽��
	public Mouse(){
		System.out.println();
	}
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	//���ýӿڵĳ��󷽷�
	@Override
	public void getEat() {
		// TODO Auto-generated method stub
	System.out.println("����ֻСצ�ӱ��ų�");
	}
	@Override
	public void getCry() {
		// TODO Auto-generated method stub
	System.out.println("������С������������");
	}
	//��װ
	public String getWeight() {
		return weight;
	}
	public void setWeight(String string) {
		this.weight = string;
	}

}
