package com.zk.qhit.statictest;

/**
 * @author 作者 E-mail:2379675496@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// 、创建Java Project工程，并创建包名com.zk.qhit.statictest ，在包中创建class 类Book.java。
	// 给Book.java类创建四个私有成员变量；其中count为static的 。
	// 、在构造方法中实现count值的递增，同时将count值进行稍微的转变赋值给变量no。
	// 实现成员变量name, price的封装 。
	// 为no,count提供只读操作 。
	// getInfo（）方法输出书籍的基本信息 。
	// 在com.tsinghua包下创建测试类TestBook.java 。
	 
		
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
