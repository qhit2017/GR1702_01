package com.zk.qhit.statictest;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月20日 下午8:01:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setName("三国演义");
		b1.setPrice(55.5);
		b1.getInfo();
		
		Book b2 = new Book ("华山论剑",26);
		b2.getInfo();
	}
}
