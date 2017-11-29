package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月25日 上午9:25:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square = new Square(25);	
		square.getLength();
		square1.setArea(625);
		square1.setPerimeter(100);
		System.out.println("正方形的边长是"+square.getLength());
		System.out.println("正方形的面积是"+square1.getArea());
		System.out.println("正方形的周长是"+square1.getPerimeter());
		
		Trapezoid trapezoid1 =new Trapezoid();
		Trapezoid trapezoid = new Trapezoid(2,3);
		
		trapezoid1.setArea(25);
		trapezoid1.setPerimeter(20);
		trapezoid1.setTall(10);
		
		trapezoid.getUpperCupLength();
		trapezoid.getHereLong();
		System.out.println("梯形的上边上是"+trapezoid.getUpperCupLength());
		System.out.println("梯形的下边长是"+trapezoid.getHereLong());
		System.out.println("梯形的高是"+trapezoid1.getTall());
		System.out.println("梯形的面积是"+trapezoid1.getArea());
		System.out.println("梯形的周长是"+trapezoid1.getPerimeter());
	}
}
