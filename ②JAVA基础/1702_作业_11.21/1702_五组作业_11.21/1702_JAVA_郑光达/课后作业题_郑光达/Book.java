/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月20日 下午5:38:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

public class Book {

	private String name;
	private int no;
	private double price;
	private static int count = 0;

	public Book(String name, int no, double price) {
		no = count++;
		this.name = name;
		this.no = no;
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

	public String getInfo() {
		String info;
		toString();
		return toString();
	}

}
