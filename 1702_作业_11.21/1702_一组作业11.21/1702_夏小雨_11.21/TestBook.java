package com.tsinghua;

public class TestBook {
public static void main(String[] args) {
	Book b1 = new Book();
	b1.setName("���Ե�����");
	b1.setPrice(29.9);
	b1.getInfo();
	
	Book b2 = new Book("���Ե��ŵ�",39.9);
	b2.getInfo();
}
}
