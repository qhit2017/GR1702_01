package com.zk.qhit.statictest;

public class Book {
	// a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
	private String no;
	private String name;
	private double price;
	private static int count = 0;

	// b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
	public Book(String name, double price) {
		count++;
		no = "TPO0" + count;
		this.name = name;
		this.price = price;
	}

	// c��ʵ�ֳ�Ա����name, price�ķ�װ ��
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// d��Ϊno,count�ṩֻ������ ��
	public String getNo() {
		return no;
	}

	public static int getCount() {
		return count;
	}

	// e��getInfo������������鼮�Ļ�����Ϣ ��
	public void getInfo() {
		System.out.println("���:" + this.getNo() + "  ��" + this.getName()
				+ "��  ,ͼ��ݹ��в���:" + Book.getCount());
	}
}
