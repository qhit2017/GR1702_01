package com.zk.qhit;

public class Book {
	//四个私有成员变量
	private String no;//编号
	private double price;//价格
	private String name;//名字
	private static int count = 0;//计数
	//构造方法
	public Book(){
		count++;
		no="S"+count;
	}
	public Book(String name,double price) {
		count++;
		no="S"+count;
		this.price = price;
		this.name = name;
	}
	//封装、get、set方法
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//no、count的只读操作
	public String getNo() {
		return no;
	}
	public static int getCount() {
		return count;
	}
	//输出书籍的基本信息 
	public void getInfo(){
		System.out.println("编号"+this.getNo()
				+"《"+this.getName()+"》，图书馆共藏书："
				+Book.getCount());
	}
	




}
