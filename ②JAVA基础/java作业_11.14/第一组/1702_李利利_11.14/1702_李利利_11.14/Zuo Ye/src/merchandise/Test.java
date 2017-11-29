package merchandise;

public class Test {
	public static void main(String[] args) {
		//不带参数的构造方法
		Merchandise  merchandise = new Merchandise();
		System.out.println(merchandise);
		
		
		
		//带编号、名称、价格三个参数的构造方法
	Merchandise TUTU = new Merchandise(	34,"衣服",64);
	
     System.out.println( "编号是:"+TUTU.id);
     System.out.println("名称是:"+TUTU.name);
     System.out.println("价格是:"+TUTU.price);
     System.out.println("品牌是:"+TUTU.brand);
 	 System.out.println("种类有:"+TUTU.category);
     
     
     
     //带五个参数的构造方法
 	Merchandise MAO = new Merchandise(	34,"衣服",64,"特步","17");
 	System.out.println( "编号是:"+MAO.id);
    System.out.println("名称是:"+MAO.name);
    System.out.println("价格是:"+MAO.price);
	System.out.println("品牌是:"+MAO.brand);
	System.out.println("种类有:"+MAO.category);
	}                                                        

}