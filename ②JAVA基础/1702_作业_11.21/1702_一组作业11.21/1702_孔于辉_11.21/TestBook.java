package com.tsinghua;



import com.zk.qhit.statictest.Book;



public class TestBook {
	public static void main(String[] args) {
		Book book = new Book("战争与和平", 85.6);
		
		System.out.println(book.getInfo());
		
	}
	
}