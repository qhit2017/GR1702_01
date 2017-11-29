
package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月20日 下午7:54:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestBook {

	public static void main(String[] args) {
		Book book = new Book("三国演义",23.6);
		System.out.println(book.getInfo());
	}
}
