package com.lf;

public class Computer {
//定义电脑的属性
	String type;//品牌
	String memory;//内存
	String price;//价格
	Computer(String typeS,String memoryS,
			String priceS){
		type   = typeS;
		memory = memoryS;
		price  = priceS;
		
	}
	public static void main(String[] args) {
		Computer s = new Computer("联想","8G","1500");
			System.out.println("品牌："+s.type);
			System.out.println("内存："+s.memory);
			System.out.println("价格："+s.price);
		
	}
}
