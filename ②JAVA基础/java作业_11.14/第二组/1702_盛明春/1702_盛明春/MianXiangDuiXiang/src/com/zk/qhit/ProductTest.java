package com.zk.qhit;

public class ProductTest {
	public static void main(String[] args) {
		Product s = new Product("手机", 50, 2500.00f, "oppo", "A77");
		System.out.println("类别" + s.category + "\n" + "型号" + s.model + "\n"
				+ "名称" + s.getName() + "\n" + "数量" + s.number + "\n" + "价格"
				+ s.price);

		s.category = "手机";

		s.setName("oppo");
		s.number = 50;
		s.price = 2500.00f;

	}
}
