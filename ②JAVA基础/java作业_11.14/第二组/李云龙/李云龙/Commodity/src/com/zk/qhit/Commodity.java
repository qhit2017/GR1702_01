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
		Commodity a = new Commodity(7,"����",7,'c',"��");
		System.out.println("��Ʒ��ţ�"+a.number);
		System.out.println("���ƣ�"+a.name);
		System.out.println("�۸�"+a.price);
		System.out.println("�ͺţ�"+a.model);
		System.out.println("���"+a.category);


}
}