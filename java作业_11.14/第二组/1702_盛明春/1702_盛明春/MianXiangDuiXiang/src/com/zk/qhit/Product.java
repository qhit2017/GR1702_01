package com.zk.qhit;

public class Product {

	/*
	 * ������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš��� ��������Ժʹ�ӡ������Ϣ������ʵ���� ���󣬲��۲��Ա������ֵ�����
	 */
	// ��Ʒ������
	private String name;
	// ��Ʒ������
	int number;
	// ��Ʒ�ļ۸�
	float price;
	// ��Ʒ���ͺ�
	String model;
	// ��Ʒ�����
	String category;

	Product(String name, int number, float price, String model, String category) {
		this.name = name;
		this.number = number;
		this.price = price;
		this.model = model;
		this.category = category;
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
