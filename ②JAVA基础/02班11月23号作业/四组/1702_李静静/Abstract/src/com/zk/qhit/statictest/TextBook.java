package com.zk.qhit.statictest;

 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月20日 下午7:21:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TextBook {

	public static void main(String[] args) {
		Book book = new Book(null,  0);
		book.setName("骆驼祥子");
		book.setPrice(23.4);
		book.getInfo();
		Book b = new Book("一笙相惜", 26.7);
		b.getInfo();
	}
}
