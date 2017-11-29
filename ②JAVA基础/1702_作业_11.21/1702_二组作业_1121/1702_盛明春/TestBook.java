package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("»Ò¹ÃÄï");
		b1.setPrice(5);
		b1.getInfo();

		Book b2 = new Book("¿ªÐÄ±¦±´", 4);
		b2.getInfo();
	}
}
