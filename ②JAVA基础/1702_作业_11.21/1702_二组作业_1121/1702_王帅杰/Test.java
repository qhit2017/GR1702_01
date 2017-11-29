package com.zk.qhit.statictest;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月20日 下午7:12:25
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("遇见");
		b1.setPrice(34.5);
		b1.getInfo();

		Book b2 = new Book("老人与海", 23);
		b2.getInfo();
	}
}
