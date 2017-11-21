package com.zk.qhit.statictest;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月20日 下午6:31:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// 四个私有变量
	private String no;
	private String name;
	private double price;
	private static int count = 0;

	// 构造方法
	public Book() {
		count++;
		no = "ti" + count;
	}

	public Book(String name, double price) {
		count++;
		no = "ti" + count;
		this.name = name;
		this.price = price;
	}

	// 实现变量name, price的封装

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

	// 为no,count提供只读操作 。
	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	// getInfo（）方法输出书籍的基本信息 。
	public void getInfo() {
		System.out.println("编号：" + this.getNo() + "    《" + this.getName()
				+ "  》 ，图书馆共藏书:" + Book.getCount());
	}
}
