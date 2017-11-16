
public class foundtest {
	public static void main(String[] args) {
		found a=new found();
		System.out.println("该商品编号是:"+a.number);
		System.out.println("该商品名是:"+a.name);
		System.out.println("该商品价格是:"+a.price);
		System.out.println("该商品型号是:"+a. model);
		System.out.println("该商品类别是:"+a.category);
		
	    System.out.println();
		
		found b=new found (55,"书包",15);
		
		System.out.println("该商品编号是:"+b.number);
		System.out.println("该商品名是:"+b.name);
		System.out.println("该商品价格是:"+b.price);
		
		found c= new found (55,"书包",2,'A',007);
		
		System.out.println("该商品编号是:"+c.number);
		System.out.println("该商品名是:"+c.name);
		System.out.println("该商品价格是:"+c.price);
		System.out.println("该商品型号是:"+c. model);
		System.out.println("该商品类别是:"+c.category);
		
		
		
		
		
		
	}

}
