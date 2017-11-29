package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book a = new Book();
		a.setName("星际大战");
		a.setPrice(35.5);
		a.getInfo();
		
		
		Book b = new Book("红与黑",23);
		b.getInfo();
	}

}
