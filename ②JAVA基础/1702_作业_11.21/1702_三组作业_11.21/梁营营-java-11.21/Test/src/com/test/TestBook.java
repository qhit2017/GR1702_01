package com.tsinghua;
//作业一：
//作者：梁营营；
import com.zk.qhit.statictest.Book;



public class TestBook {

	public static void main(String[] args) {
		Book book = new Book("鲁滨逊漂流记", 25.6);
		book.getInfo();
		Book book1 = new Book("心灵鸡汤", 23.5);
		book.getInfo();
	}
}
