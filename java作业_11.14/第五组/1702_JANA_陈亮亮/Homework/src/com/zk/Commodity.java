package com.zk;

/**
 * 制作者：陈亮亮 制作时间：2017年11月14日上午8:38:54 邮箱：2507147605@qq.com
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
