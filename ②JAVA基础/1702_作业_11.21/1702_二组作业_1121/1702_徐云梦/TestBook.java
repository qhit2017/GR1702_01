/**
 * 
 */
package com.tsinghua;

import com.zk.qhit.statictest.Book;

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月21日 上午11:12:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {
	public static void main(String[] args) {
		Book b1 =new Book();
		b1.setName("小狗爱吃骨头");
		b1.setPrice(34.5);
		b1.getInfo();
		
		Book b2 = new Book("小猫爱吃鱼",23);
		b2.getInfo();
	}

}
