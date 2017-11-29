package com.qhit;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Test {
	
	 //d.创建测试类，分别创建正方形和梯形的实例化对象，给对象的属性赋值，
     //并且调用对象的周长、面积的方法
	
	public static void main(String[] args) {
		
		Square square = new Square();
		square.setSide(3.2);
		square.setPerimeter(12.8);
		square.setArea(10.24);
		System.out.println("正方形边长为："+square.getSide()
							+"\n"+"周长为："+square.getPerimeter()
							+"\n"+"面积为："+square.getArea());
		
		System.out.println();
		
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setUpside(2.1);
		trapezoid.setUnder(4.2);
		trapezoid.setHigh(3.2);
		trapezoid.setPerimeter(12.5);
		trapezoid.setArea(10.08);
		
		System.out.println("梯形上边长为："+trapezoid.getUpside()
								+"\n"+"下边长为："+trapezoid.getUnder()
								+"\n"+"高为："+trapezoid.getHigh()
								+"\n"+"周长为："+trapezoid.getPerimeter()
								+"\n"+"面积为："+trapezoid.getUpside());
		square.area();
		square.perimeter();
	}

}
