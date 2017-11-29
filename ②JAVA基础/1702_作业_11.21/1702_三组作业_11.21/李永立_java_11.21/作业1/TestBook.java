package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月21日 下午4:52:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class TestBook {
	
	public static void main(String[] args) {
		
		Book book = new Book("新华字典", 2.8);
		System.out.println(book.getinfo());
	}

}
