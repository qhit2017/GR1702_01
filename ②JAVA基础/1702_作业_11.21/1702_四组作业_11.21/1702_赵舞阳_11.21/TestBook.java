package com.tsinghua;

import com.zk.qhit.statictest.Book;

//f、在com.tsinghua包下创建测试类TestBook.java 。
public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book("推倒思维的墙", 80.5);
		b1.getInfo();
		Book b2 = new Book("说话的艺术", 24);
		b2.getInfo();
	}
}
