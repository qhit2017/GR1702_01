package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����10:06:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setName("��¥��");
		b1.setPrice(36.5);
		b1.getInfo();
		
		
		
		Book b2 = new Book("���μ�",24);
		b2.getInfo();
	}
}
