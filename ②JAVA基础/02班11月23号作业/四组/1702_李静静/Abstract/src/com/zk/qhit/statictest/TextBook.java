package com.zk.qhit.statictest;

 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:21:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TextBook {

	public static void main(String[] args) {
		Book book = new Book(null,  0);
		book.setName("��������");
		book.setPrice(23.4);
		book.getInfo();
		Book b = new Book("һ����ϧ", 26.7);
		b.getInfo();
	}
}
