package com.qhit;

public class Test {

	
	public static void main(String[] args) {
		Zhengfangxing op = new Zhengfangxing(5);
		System.out.println("�����ε��ܳ�"+op.getZhouchang());
		System.out.println("�����ε����"+op.getMianji());
		
		
		Tixing lk = new Tixing(5, 4);
		lk.gao = 6;
		lk.zuobianchang = 3;
		lk.youbianchang = 4;
		System.out.println("���ε��ܳ�"+lk.getZhouchang());
		System.out.println("���ε����"+lk.getMianji());
		
	}
	
}
