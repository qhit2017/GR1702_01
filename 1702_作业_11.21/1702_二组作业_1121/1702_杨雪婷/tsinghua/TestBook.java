package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����10:05:33 
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
		b1.setName("��ħ���ӱ�����");
		b1.setPrice(34.5);
		b1.getInfo();
		Book b2=new Book("��С�����������",23);
		b2.getInfo();
	}
}
