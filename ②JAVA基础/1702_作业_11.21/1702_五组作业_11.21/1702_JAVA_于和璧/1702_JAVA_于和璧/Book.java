package com.zk.qhit.statictest;

public class Book {

	private  String no;
	private  String name;
	private  double price;
	private static int count =0;
	
	
	
	public Book() {
		count++;
		no="TPOO"+count;
	}
	
	
	public Book(String name, double price) {
		count++;
		no = "TPOO"+count;
		this.name = name;
		this.price = price;
	}


	
	

	public void getInfo(){
		
		System.out.println("��ţ�"+this.getNo()+"��"+this.getName()+"����ͼ��ݹ��в��飺"+Book.getCount());
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


	public String getNo() {
		return no;
	}


	public static int getCount() {
		return count;
	}
	
	
	
	
}
