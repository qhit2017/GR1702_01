package com.tsinghua;

public class TestBook {
public static void main(String[] args) {
	Book b1 = new Book();
	b1.setName("人性的弱点");
	b1.setPrice(29.9);
	b1.getInfo();
	
	Book b2 = new Book("人性的优点",39.9);
	b2.getInfo();
}
}
