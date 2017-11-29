package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since                                                                                                                                     
 * @return  
 * @function
 */
public class BookTest {
	public static void main(String[] args) {
		Book b=new Book("了不起的盖茨比", 35.9);
		System.out.println(b.toString());
		System.out.println(b.getinfo());
	}

}
