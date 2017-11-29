package yangxueting;

public class Product {
	String name;
	int number;
	int price;
	String model;
	String category;
	
	//默认不带参数构造方法
	public Product(){
		System.out.println("不带参数:");
	}
	//带三个参数的构造方法
	public Product(String nameA,int numberA,int priceA){
		name=nameA;
		number=numberA;
		price=priceA;
		System.out.println("带三个参数:");
	}
	
	//带所有参数的构造
	Product(String nameB,int numberB,int priceB,String modelB,String categoryB){
		name=nameB;
		number=numberB;
		price=priceB;
		model=modelB;
		category=categoryB;
		System.out.println("带五个参数:");
		
	}

}
