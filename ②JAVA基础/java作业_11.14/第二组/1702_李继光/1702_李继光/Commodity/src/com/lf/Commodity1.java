package com.lf;

public class Commodity1 {
	// 第一种 无参数
	int number;
	String name;
	int price;
	char type;
	String sort;

	Commodity1() {
		System.out.println("第一种无参数的构造方法");
	}

	public static void main(String[] args) {
		Commodity1 s = new Commodity1();
		s.name="小样酸Q糖";
	}

}
