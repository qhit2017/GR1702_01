package com.zk.qhit;

public class Book {
	// 四个私有成员变量
	private String no;
	private String name;
	private double prince;
	private static int count = 0;

	// 构造方法
	public Book() {
		count++;
		no = "a" + count;
	}

	public Book(String no, String name, double prince) {
		count++;
		no = "a" + count;
		this.name = name;
		this.prince = prince;
	}

	// 实现成员变量name, price的封装

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrince() {
		return prince;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	// no,count只读操作
	public String getNo() {
		return no;
	}

	public static int getCount() {
		return count;
	}

	// 输出书籍的基本信息
	public void getInfo() {
		System.out.println("编号：" + this.getNo() + "  《" + this.getName()
				+ "》,图书馆共有藏书：" + Book.getCount());

	}

}
