package com.zk.qhit;

public class TestBook {
	public static void main(String[] args) {
		Book a = new Book();
		a.setName("Ϊ��");
		a.setPrince(13);
		a.getInfo();

		Book b = new Book("����", null, 14);
		b.getInfo();
	}
}
