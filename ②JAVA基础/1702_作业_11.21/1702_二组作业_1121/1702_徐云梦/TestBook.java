/**
 * 
 */
package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��21�� ����11:12:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {
	public static void main(String[] args) {
		Book b1 =new Book();
		b1.setName("С�����Թ�ͷ");
		b1.setPrice(34.5);
		b1.getInfo();
		
		Book b2 = new Book("Сè������",23);
		b2.getInfo();
	}

}
