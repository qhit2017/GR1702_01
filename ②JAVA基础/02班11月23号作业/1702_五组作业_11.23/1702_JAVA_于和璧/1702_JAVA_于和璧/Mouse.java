package com.zk;

public class Mouse implements IZoology {
	
	/*c.�������� ʵ�ֶ�������ӿڡ�
	 * Ҫ��������е����԰�����������Ʒ�֡������ȡ����أ�����˽�У� ��
	 * ���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����(non-Javadoc)
	 */

	private String name;//����
	private String variety;//Ʒ��
	private int leg;//��
	private double weight;//����

	public String getEat() {
		// TODO Auto-generated method stub
		return "����͵�Դ��ף�";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "����֨֨֨�У�";
	}

	public Mouse() {
		
	}
	
	public Mouse(String name, String variety) {
		
		this.name = name;
		this.variety = variety;
		
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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

	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}
