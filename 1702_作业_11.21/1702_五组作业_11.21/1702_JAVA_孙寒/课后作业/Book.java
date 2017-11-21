package com.zk.qhit.statictest;

import java.util.concurrent.CountDownLatch;

public class Book {
	//给Book.java类创建四个私有成员变量；其中count为static的 。
	
	private String name;//名字
	private double prive;//价格
	private static int count=0;
	private String no;
	
	public Book(){
		count++;
		no="Tpoo"+count;
	}
	
	public Book(String name, double prive) {
		count++;
		no="Tpoo"+count;
		this.name = name;
		this.prive = prive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrive() {
		return prive;
	}

	public void setPrive(double prive) {
		this.prive = prive;
	}

	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	public void getInfor(){
		System.out.println("编号:"+this.getNo()+"<<"+this.getName()+">>,图书馆共有藏书:"+Book.getCount());
	}
	
	
	
	


}
