package com.zk.qhit;

public class ProductTest {
	public static void main(String[] args) {
		Product s = new Product("�ֻ�", 50, 2500.00f, "oppo", "A77");
		System.out.println("���" + s.category + "\n" + "�ͺ�" + s.model + "\n"
				+ "����" + s.getName() + "\n" + "����" + s.number + "\n" + "�۸�"
				+ s.price);

		s.category = "�ֻ�";

		s.setName("oppo");
		s.number = 50;
		s.price = 2500.00f;

	}
}
