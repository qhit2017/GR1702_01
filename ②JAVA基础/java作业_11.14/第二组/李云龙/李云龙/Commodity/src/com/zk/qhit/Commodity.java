package com.zk.qhit;



public class Commodity {
int   number;
String  name;
int  price;
char  model ;
String   category;
 Commodity(int numbers,String names,int prices,char models,String categorys){
		 
	 number = numbers;
	 name = names;
	 price = prices;
	 model = models;
	 category = categorys;
	
				
			}
 public static void main(String[] args) {
		Commodity a = new Commodity(7,"酸糖",7,'c',"糖");
		System.out.println("商品编号："+a.number);
		System.out.println("名称："+a.name);
		System.out.println("价格："+a.price);
		System.out.println("型号："+a.model);
		System.out.println("类别："+a.category);


}
}