package com.lf;

public class Commodity2 {
	//�ڶ��� ��������
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
		Commodity2 a = new Commodity2(110,"С����Q��",100);
		System.out.println("��Ʒ��ţ�"+a.number);
		System.out.println("���ƣ�"+a.name);
		System.out.println("�۸�"+a.price);
	}

}
