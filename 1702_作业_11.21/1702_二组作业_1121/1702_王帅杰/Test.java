package com.zk.qhit.statictest;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����7:12:25
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("����");
		b1.setPrice(34.5);
		b1.getInfo();

		Book b2 = new Book("�����뺣", 23);
		b2.getInfo();
	}
}
