package xiajie;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		System.out.println("商品编号：" + p1.id);
		System.out.println("商品名称：" + p1.name);
		System.out.println("商品价格：" + p1.price);
		System.out.println("商品型号：" + p1.model);
		System.out.println("商品类别：" + p1.category);
	}

}
