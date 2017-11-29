package com.qhit;

public class Test {

	
	public static void main(String[] args) {
		Zhengfangxing op = new Zhengfangxing(5);
		System.out.println("正方形的周长"+op.getZhouchang());
		System.out.println("正方形的面积"+op.getMianji());
		
		
		Tixing lk = new Tixing(5, 4);
		lk.gao = 6;
		lk.zuobianchang = 3;
		lk.youbianchang = 4;
		System.out.println("梯形的周长"+lk.getZhouchang());
		System.out.println("梯形的面积"+lk.getMianji());
		
	}
	
}
