package Handset;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月14日 下午5:41:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Handset {
	String type;// 品牌
	String memory;// 内存
	String price;// 价格

	Handset(String types, String memoryS, String priceS) {
		type = types;
		memory = memoryS;
		price = priceS;
	}

	public static void main(String[] args) {
		Handset s = new Handset("苹果", "64G", "7999");
		System.out.println("品牌：" + s.type);
		System.out.println("内存：" + s.memory);
		System.out.println("价格:" + s.price);

	}
}
