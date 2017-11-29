package com.zk.qhit;

public class TestBook {
	public static void main(String[] args) {
		Book a = new Book();
		a.setName("ÎªÄã");
		a.setPrince(13);
		a.getInfo();

		Book b = new Book("²»»Ú", null, 14);
		b.getInfo();
	}
}
