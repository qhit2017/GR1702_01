

public class jfasflalka {

	public static void main(String[] args) {
		
		lixiaohao a = new lixiaohao();
	
		
		System.out.println("此商品编号为:"+a.number);
		System.out.println("此商品名为:"+a.name);
		System.out.println("此商品价格为:"+a.price);
		System.out.println("此商品型号为:"+a.type);
		System.out.println("此商品类别为:"+a.sort);
		
		System.out.println();
		
		lixiaohao b = new lixiaohao (66,"雕牌洗衣粉",15.5);
		System.out.println("此商品编号为:"+b.number);  
		System.out.println("此商品名为:"+b.name);
		System.out.println("此商品价格为:"+b.price);
		System.out.println("此商品型号为:"+b.type);
		System.out.println("此商品类别为:"+b.sort);
		
		System.out.println();
		
		lixiaohao c = new lixiaohao (66,"雕牌洗衣粉",15.5,'A',"生活用品");
		System.out.println("此商品编号为:"+c.number);
		System.out.println("此商品名为:"+c.name);
		System.out.println("此商品价格为:"+c.price);
		System.out.println("此商品型号为:"+c.type);
		System.out.println("此商品类别为:"+c.sort);
		
		
	}
}
