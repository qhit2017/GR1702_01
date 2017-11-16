package com.lf;

public class Commodity2 {
	//第二种 三个参数
	int number;
    String name;
    int price;
    char type;
    String sort;
    Commodity2(int numberS,String nameS,int priceS){
   	 number = numberS;
   	 name   = nameS;
   	 price  = priceS;
    }
      public static void main(String[] args) {
		Commodity2 a = new Commodity2(110,"小样酸Q糖",100);
		System.out.println("商品编号："+a.number);
		System.out.println("名称："+a.name);
		System.out.println("价格"+a.price);
	}

}
