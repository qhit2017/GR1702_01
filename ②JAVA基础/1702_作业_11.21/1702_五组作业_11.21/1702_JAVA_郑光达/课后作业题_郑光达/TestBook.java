/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月21日 上午9:58:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	public static void main(String[] args) {

		Book book = new Book("新华字典", 0, 8.5);
		System.out.println(book.getInfo());
		System.out.println(book.toString());

	}

}
