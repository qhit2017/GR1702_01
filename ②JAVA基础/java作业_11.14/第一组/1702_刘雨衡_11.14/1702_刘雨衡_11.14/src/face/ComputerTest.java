package face;

public class ComputerTest {
public static void main(String[] args) {
		
		Computer a = new Computer("机械师",7999,"笔记本电脑");
		
		System.out.println("该商品的品牌是："+a.name);
		System.out.println("该商品的价格是："+a.price);
		System.out.println("该商品的类型是："+a.category);
	}
}

