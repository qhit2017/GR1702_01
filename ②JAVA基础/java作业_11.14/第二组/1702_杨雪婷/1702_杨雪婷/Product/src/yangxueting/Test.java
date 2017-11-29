package yangxueting;

public class Test {

	public static void main(String[] args) {
		Product h=new Product();
		System.out.println("此商品名为:"+h.name);
		System.out.println("此商品编号为:"+h.number);
		System.out.println("此商品价格为:"+h.price);
		System.out.println("此商品为:"+h.model);
		System.out.println("此商品类型为:"+h.category);
		System.out.println();
		
		Product g=new Product("笔记本",6,6);
		System.out.println("此商品名为:"+g.name);
		System.out.println("此商品编号为:"+g.number);
		System.out.println("此商品价格为:"+g.price);
		System.out.println("此商品为:"+g.model);
		System.out.println("此商品类型为:"+g.category);
		System.out.println();
		
		Product j=new Product("笔记本",6,6,"硬皮本","课堂笔记");
		System.out.println("此商品名为:"+j.name);
		System.out.println("此商品编号为:"+j.number);
		System.out.println("此商品价格为:"+j.price);
		System.out.println("此商品为:"+j.model);
		System.out.println("此商品类型为:"+j.category);
		
	}		
}
