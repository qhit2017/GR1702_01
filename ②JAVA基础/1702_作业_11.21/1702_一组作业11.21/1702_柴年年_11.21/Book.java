package com.zk.qhit.statictest;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����6:36:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {

	private String name;
	private int no;
	private static int count = 0;
	private double price;



	public Book(String name, double price) {	
		no = count++;
		this.name = name;
		this.price = price;
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
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	String getInfo(){
		 String Info;
		 Info = toString();
		 return Info;
	}
}
