package com.tsinghua;

import com.zk.qhit.Book;

public class TestBook {
	public static void main(String[] args) {
		System.out.println("最喜欢的书：");
		Book s = new Book();
		s.setName("书    欣");
		s.setPrice(102.0);
		s.getInfo();
		Book ss = new Book("大小姐",120.7);
		ss.getInfo();
	}
}






