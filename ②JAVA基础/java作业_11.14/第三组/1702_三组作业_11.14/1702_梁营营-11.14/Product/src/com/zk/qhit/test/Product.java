package com.zk.qhit.test;

//���ߣ���ӪӪ��
public class Product {
	// ��ҵһ��
	// �����Ա������
	int id;
	String name;
	double value;
	String model;
	String classes;

	// �������������Ĺ��췽����
	public Product() {
		
	}

	// ��������š����ơ��۸����������Ĺ��췽����
	public Product(int id, String name, double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	// ��������������Ĺ��췽����
	public Product(int id, String name, double value, String model,
			String classes) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.model = model;
		this.classes = classes;
		System.out.println("����:" + id + "\t����:" + name + "\t�۸�:" + value
				+ "\t�ͺ�:" + model + "\t���:" + classes);

	}
}
