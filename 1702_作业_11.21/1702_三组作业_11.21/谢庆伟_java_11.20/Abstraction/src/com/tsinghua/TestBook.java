package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月21日 上午10:00:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		Book t=new Book();
		t.setName("《推背图》");
		t.setPrice(1104);
		t.getinfo();
		System.out.println(Book.getCount());
		System.out.println(t.getNo());

	}

}
