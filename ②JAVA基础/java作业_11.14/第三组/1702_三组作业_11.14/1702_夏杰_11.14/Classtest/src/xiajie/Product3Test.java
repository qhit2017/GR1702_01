package xiajie;

public class Product3Test {
	
	public static void main(String[] args) {
		//商品编号、名称、价格、型号、类别
		Product3 p3 = new Product3("007","苹果",22.30,"A","红富士");
		
		p3.id = "007";
		p3.name = "苹果";
		p3.price = 22.30;
		p3.model = "A";
		p3.category = "红富士";
		
		System.out.println("商品编号：" + p3.id);
		System.out.println("商品名称：" + p3.name);
		System.out.println("商品价格：" + p3.price);
		System.out.println("商品型号：" + p3.model);
		System.out.println("商品类别：" + p3.category);
	}

}
