package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����9:25:33 
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
		System.out.println("�����εı߳���"+square.getLength());
		System.out.println("�����ε������"+square1.getArea());
		System.out.println("�����ε��ܳ���"+square1.getPerimeter());
		
		Trapezoid trapezoid1 =new Trapezoid();
		Trapezoid trapezoid = new Trapezoid(2,3);
		
		trapezoid1.setArea(25);
		trapezoid1.setPerimeter(20);
		trapezoid1.setTall(10);
		
		trapezoid.getUpperCupLength();
		trapezoid.getHereLong();
		System.out.println("���ε��ϱ�����"+trapezoid.getUpperCupLength());
		System.out.println("���ε��±߳���"+trapezoid.getHereLong());
		System.out.println("���εĸ���"+trapezoid1.getTall());
		System.out.println("���ε������"+trapezoid1.getArea());
		System.out.println("���ε��ܳ���"+trapezoid1.getPerimeter());
	}
}
