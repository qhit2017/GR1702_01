package com.zk.qhit.statictest;
/*�����ˣ�����
 *����ʱ�䣺2017��11��20������7:42:36
 *���䣺2408368509@qq.com
 */

public class TestBook {
	public static void main(String[] args) {
		Book w1=new Book();
		w1.setName("���ﻨ��֪����");
		w1.setPrice(92.5);
		w1.getInfo();
		System.out.println(w1.getPrice());
		Book x1 = new Book("������ɳĮ�Ĺ���",77);
		x1.getInfo();
	}
}
