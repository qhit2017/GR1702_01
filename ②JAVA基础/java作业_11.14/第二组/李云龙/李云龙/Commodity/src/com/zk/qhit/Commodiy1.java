package com.zk.qhit;

public class Commodiy1 {
	int   number;
	String  name;
	int  price;
	char  model ;
	String   category;
	Commodiy1( int number,String name,int  price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		Commodiy1 a = new Commodiy1(7,"ÌðÌÇ",7);
		System.out.println(a.name);
		System.out.println(a.number);
		System.out.println(a.price);
	}
}
