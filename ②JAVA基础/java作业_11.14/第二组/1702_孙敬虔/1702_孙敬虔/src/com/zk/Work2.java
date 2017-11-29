package com.zk;

/**
 * @author 作者 E-mail:chenglong793708@547.com
 * @date 创建时间：2017年11月14日 上午8:36:18
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
		Work2 s = new Work2("华为", "32G", "1999");
		System.out.println("品牌：" + s.type);
		System.out.println("内存：" + s.memory);
		System.out.println("价格：" + s.price);

	}
}
