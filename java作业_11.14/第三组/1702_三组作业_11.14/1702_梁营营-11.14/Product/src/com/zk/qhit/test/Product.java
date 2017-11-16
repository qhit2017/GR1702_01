package com.zk.qhit.test;

//作者：梁营营；
public class Product {
	// 作业一：
	// 定义成员变量；
	int id;
	String name;
	double value;
	String model;
	String classes;

	// 创建不带参数的构造方法；
	public Product() {
		
	}

	// 创建带编号、名称、价格三个参数的构造方法；
	public Product(int id, String name, double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	// 创建带五个参数的构造方法；
	public Product(int id, String name, double value, String model,
			String classes) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.model = model;
		this.classes = classes;
		System.out.println("编码:" + id + "\t名称:" + name + "\t价格:" + value
				+ "\t型号:" + model + "\t类别:" + classes);

	}
}
