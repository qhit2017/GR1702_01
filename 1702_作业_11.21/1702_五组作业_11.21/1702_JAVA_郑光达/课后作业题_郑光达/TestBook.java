/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��21�� ����9:58:10 
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

		Book book = new Book("�»��ֵ�", 0, 8.5);
		System.out.println(book.getInfo());
		System.out.println(book.toString());

	}

}
