package com.zk.qhit.statistest;

import java.awt.print.Book;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��20������6:52:14 ���䣺2507147605@qq.com
 */
public class Bookjana {
	private static int count = 0;//
	private double price;// �۸�
	private String name;// ����
	int no;

	
	

	public Bookjana(double price, String name) {
		no = count++;
		this.price = price;
		this.name = name;
		
	}

	
public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Bookjana.count = count;
	}


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

	
	
	

	@Override
	public String toString() {
		return "Bookjana [price=" + price + ", name=" + name + "]";
	}

	public String getinfo() {
		return "Bookjana [price=" + price + ", name=" + name + "]";
	}


}

