package com.tsinghua;

import com.zk.qhit.Book;

public class TestBook {
	public static void main(String[] args) {
		System.out.println("��ϲ�����飺");
		Book s = new Book();
		s.setName("��    ��");
		s.setPrice(102.0);
		s.getInfo();
		Book ss = new Book("��С��",120.7);
		ss.getInfo();
	}
}






