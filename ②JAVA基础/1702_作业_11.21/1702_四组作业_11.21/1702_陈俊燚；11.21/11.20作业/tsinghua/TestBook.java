package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	public static void main(String[] args) {
		{
			Book b1 = new Book();
			b1.setName("��˥Ư����");
			b1.setPrice(25.60);
			b1.getInfo();

			Book b2 = new Book("��˥Ư���Ǻ�", 18);
			b2.getInfo();

		}
	}
}
