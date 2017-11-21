package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月21日 上午10:06:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setName("红楼梦");
		b1.setPrice(36.5);
		b1.getInfo();
		
		
		
		Book b2 = new Book("西游记",24);
		b2.getInfo();
	}
}
