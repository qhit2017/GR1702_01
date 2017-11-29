package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月21日 上午10:05:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public TestBook() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setName("恶魔王子别吻我");
		b1.setPrice(34.5);
		b1.getInfo();
		Book b2=new Book("项小五的浪漫爱情",23);
		b2.getInfo();
	}
}
