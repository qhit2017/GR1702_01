package com.zk;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��14������8:38:54 ���䣺2507147605@qq.com
 */
public class Commodity {
	String color;
	String name;
	double price;
	String model;
	String category;

	Commodity() {

	}
	
	
	Commodity(String colorA,String nameA,double priceA) {
		color=colorA;
		name =nameA;		
	    price=priceA;
	} 
	
	Commodity(String colorB,String nameB,double priceB,String modelB,String categoryB) {
		color=colorB;
		name =nameB;		
	    price=priceB;
	    model=modelB;
	    category=categoryB;
	}
	
}
