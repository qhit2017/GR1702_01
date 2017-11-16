package lishaoqing2;

public class D2s {
public static void main(String[] args) {
	D2 c = new D2("008","闪迪","U盘","32GB");

	System.out.println("编号："+c.getId());
	System.out.println("品牌："+c.tradmark);
	System.out.println("商品名："+c.name);
	System.out.println("容量："+c.memory);
	c.setId("000");
}
}
