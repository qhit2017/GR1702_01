package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:22:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		Square square = new Square(5);
		
		System.out.println("�������ܳ���" + square.perimeter());
		
		System.out.println("����������ǣ�" + square.area());

		Trapezoid trapezoid = new Trapezoid(5, 6);
		
		trapezoid.left = 6;
		
		trapezoid.right = 4;
		
		trapezoid.high = 2;
		
		System.out.println("�����ܳ���" + trapezoid.perimeter());
		
		System.out.println("��������ǣ�" + trapezoid.area());
	}
}
