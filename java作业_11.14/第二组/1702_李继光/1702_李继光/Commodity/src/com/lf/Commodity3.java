package com.lf;

public class Commodity3 {
	//第三种 五个参数
	int number;
    String name;
    int price;
    char type;
    String sort;
    Commodity3(int numberS,String nameS,int priceS,
    		char typeS,String sortS){
   	 number = numberS;
   	 name   = nameS;
   	 price  = priceS;
   	 type   = typeS;
   	 sort   = sortS;
}
    public static void main(String[] args) {
		Commodity3 d = new Commodity3(110,"小样酸Q糖",100,'C',"软糖类");
		System.out.println("商品编号:"+d.number);
		System.out.println("名称:"+d.name);
		System.out.println("价格:"+d.price);
		System.out.println("型号:"+d.type);
		System.out.println("类别:"+d.sort);


}
    }