package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午7:11:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		Book t=new Book();
		t.setName("《推背图》");
		t.setPrice(1104);
		t.getinfo();
		System.out.println(Book.getCount());
		System.out.println(t.getNo());

	}

}
