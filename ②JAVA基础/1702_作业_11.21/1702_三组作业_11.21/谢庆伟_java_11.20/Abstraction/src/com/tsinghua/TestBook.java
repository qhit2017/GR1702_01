package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����10:00:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		Book t=new Book();
		t.setName("���Ʊ�ͼ��");
		t.setPrice(1104);
		t.getinfo();
		System.out.println(Book.getCount());
		System.out.println(t.getNo());

	}

}
