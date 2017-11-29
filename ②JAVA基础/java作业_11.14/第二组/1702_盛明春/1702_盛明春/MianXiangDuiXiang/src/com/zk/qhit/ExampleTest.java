package com.zk.qhit;

public class ExampleTest {
	public static void main(String[] args) {
		Example a = new Example("包子", 50, (float) 0.5);
		System.out.println("名称:" + a.name + "\n" + "数量:" + a.number + "\n"
				+ "单价:" + a.price + "\n");

	}
}
