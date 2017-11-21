package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	
	public static void main(String[] args) {
	
		Book w=new Book("那年花开月正圆", 55.5);
		
		System.out.println(w.getInfo());
	}
}
