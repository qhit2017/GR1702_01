package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book a = new Book();
		a.setName("�Ǽʴ�ս");
		a.setPrice(35.5);
		a.getInfo();
		
		
		Book b = new Book("�����",23);
		b.getInfo();
	}

}
