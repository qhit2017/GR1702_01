package com.lf;

public class Commodity3 {
	//������ �������
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
		Commodity3 d = new Commodity3(110,"С����Q��",100,'C',"������");
		System.out.println("��Ʒ���:"+d.number);
		System.out.println("����:"+d.name);
		System.out.println("�۸�:"+d.price);
		System.out.println("�ͺ�:"+d.type);
		System.out.println("���:"+d.sort);


}
    }