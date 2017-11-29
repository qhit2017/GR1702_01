package xiajie;

public class Product2Test {
	
	public static void main(String[] args) {
		
		Product2 p2 = new Product2("007","苹果",22.30);
		
		p2.id = "007";
		p2.name = "苹果";
		p2.price = 22.30;
		
		System.out.println("商品编号："+ p2.id);
		System.out.println("商品名称："+ p2.name);
		System.out.println("商品价格："+ p2.price);
		
	}

}
