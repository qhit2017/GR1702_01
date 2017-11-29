package com.zk.qhit.statictest;

public class Book {
 
	private String name;
	private static int count=0;
	private double price;
	private String on;
	
	public Book(){
		count++;
		on="TPOO"+count;
	}
	
	
	
	
	public Book(String name, double price) {
		count++;
		on="TPOO"+count;
		this.name = name;
		this.price = price;
	}
	public void getInfo(){
		System.out.println("±‡∫≈:"+this.getOn()+"°∂"+this.getName()+"°∑,Õº Èπ›π≤≤ÿ È:"+Book.getCount());
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
	public String getOn() {
		return on;
	}
	
		
	}

