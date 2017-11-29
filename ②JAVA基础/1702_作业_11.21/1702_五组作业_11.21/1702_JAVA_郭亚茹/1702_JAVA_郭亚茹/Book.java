package com.zk.qhit.statictest;

/**
 * @author ���� E-mail:2379675496@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// ������Java Project���̣�����������com.zk.qhit.statictest ���ڰ��д���class ��Book.java��
	// ��Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
	// ���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
	// ʵ�ֳ�Ա����name, price�ķ�װ ��
	// Ϊno,count�ṩֻ������ ��
	// getInfo������������鼮�Ļ�����Ϣ ��
	// ��com.tsinghua���´���������TestBook.java ��
	 
		
    private String no;
	private String name;
	private double price;
	private static int count = 0;

	public Book() {
		count++;
		no = "TPOO"+count;
	}

	public Book(String name, double price) {
		count++;
		no = "TPO0"+count;
		this.name = name;
		this.price = price;

	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

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

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}

	@Override 
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public String getinfo() {
		String info;
		info = toString();
		return toString();
	}
}
