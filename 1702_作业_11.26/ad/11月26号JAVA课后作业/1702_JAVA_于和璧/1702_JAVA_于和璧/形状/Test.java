package com.qhit;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Test {
	
	 //d.���������࣬�ֱ𴴽������κ����ε�ʵ�������󣬸���������Ը�ֵ��
     //���ҵ��ö�����ܳ�������ķ���
	
	public static void main(String[] args) {
		
		Square square = new Square();
		square.setSide(3.2);
		square.setPerimeter(12.8);
		square.setArea(10.24);
		System.out.println("�����α߳�Ϊ��"+square.getSide()
							+"\n"+"�ܳ�Ϊ��"+square.getPerimeter()
							+"\n"+"���Ϊ��"+square.getArea());
		
		System.out.println();
		
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setUpside(2.1);
		trapezoid.setUnder(4.2);
		trapezoid.setHigh(3.2);
		trapezoid.setPerimeter(12.5);
		trapezoid.setArea(10.08);
		
		System.out.println("�����ϱ߳�Ϊ��"+trapezoid.getUpside()
								+"\n"+"�±߳�Ϊ��"+trapezoid.getUnder()
								+"\n"+"��Ϊ��"+trapezoid.getHigh()
								+"\n"+"�ܳ�Ϊ��"+trapezoid.getPerimeter()
								+"\n"+"���Ϊ��"+trapezoid.getUpside());
		square.area();
		square.perimeter();
	}

}
