package com.tsinghua;
//��ҵһ��
//���ߣ���ӪӪ��
import com.zk.qhit.statictest.Book;



public class TestBook {

	public static void main(String[] args) {
		Book book = new Book("³��ѷƯ����", 25.6);
		book.getInfo();
		Book book1 = new Book("���鼦��", 23.5);
		book.getInfo();
	}
}
