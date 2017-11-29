package com.zk.qhit.statictest;

public class Book {

	private String no;
	private String name;
	private double price;
	private static int count=001;
	

	
	public Book(String name, double price) {
		no= "±àºÅ"+count++;
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


	
	
	public String getPage() {
		return no;
	}


	public static int getCount() {
		return count;
	}


	
	public String toString() {
		return "Book [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	
	public String getInfo() {
		String getInfo;
		getInfo=toString();
		return getInfo;
	}
	
	
	
	
	
	
}
