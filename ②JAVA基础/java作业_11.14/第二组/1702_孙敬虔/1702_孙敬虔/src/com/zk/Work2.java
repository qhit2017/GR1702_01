package com.zk;

/**
 * @author ���� E-mail:chenglong793708@547.com
 * @date ����ʱ�䣺2017��11��14�� ����8:36:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Work2 {

	String type;
	String memory;
	String price;

	Work2(String types, String memorys, String prices) {
		type = types;
		memory = memorys;
		price = prices;
	}

	public static void main(String[] args) {
		Work2 s = new Work2("��Ϊ", "32G", "1999");
		System.out.println("Ʒ�ƣ�" + s.type);
		System.out.println("�ڴ棺" + s.memory);
		System.out.println("�۸�" + s.price);

	}
}
