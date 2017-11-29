package face;

public class Test {
public static void main(String[] args) {
	Category p = new Category();

	System.out.println(p);
	System.out.println();

	Category a = new Category("811", "备忘录", 21);

	System.out.println(a.getSerial());
	System.out.println(a.name);
	System.out.println(a.price);

	System.out.println();

	Category s = new Category("811", "备忘录", 21, "晨光", "笔记本");

	System.out.println("该商品的编号是："+s.getSerial());
	System.out.println("该商品的名称是："+s.name);
	System.out.println("该商品的价格是："+s.price);
	System.out.println("该商品的品牌是："+s.model);
	System.out.println("该商品的类别是："+s.category);
}
}
