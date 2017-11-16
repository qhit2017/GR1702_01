package com.zk.qhit;

public class Product {

	/*
	 * 创建商品类，并给出商品编号、名称、价格、型号、类 别五个属性和打印自身信息方法，实例化 对象，并观察成员变量赋值情况；
	 */
	// 商品的名称
	private String name;
	// 商品的数量
	int number;
	// 商品的价格
	float price;
	// 商品的型号
	String model;
	// 商品的类别
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
