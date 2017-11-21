package com.zk.qhit.statictest;
/*制作人：王欣
 *制作时间：2017年11月20日下午7:42:36
 *邮箱：2408368509@qq.com
 */

public class TestBook {
	public static void main(String[] args) {
		Book w1=new Book();
		w1.setName("梦里花落知多少");
		w1.setPrice(92.5);
		w1.getInfo();
		System.out.println(w1.getPrice());
		Book x1 = new Book("撒哈拉沙漠的故事",77);
		x1.getInfo();
	}
}
